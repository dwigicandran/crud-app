package com.bootcamp.crud.controller;

import com.bootcamp.crud.model.Computer;
import com.bootcamp.crud.model.User;
import com.bootcamp.crud.repository.ComputerRepository;
import com.bootcamp.crud.service.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ComputerController {

    @Autowired
    ComputerRepository computerRepository;

    @Autowired
    ComputerService computerService;

    @GetMapping("/computer")
    List<Computer> getAllComputer(){
        return computerRepository.findAll();
    }

    @PostMapping("/computer/insert")
    public Computer insertComputer(@RequestBody Computer data){
        Computer response;
        response = computerRepository.save(data);
        return response;
    }

    @DeleteMapping("computer/delete")
    Map<String ,Object> deteleComputer(@RequestParam long id){
        Map<String,Object> response = new HashMap<>();
        if (computerService.deleteComputer(id)){
            response.put("success",true);
            response.put("message","data berhasil dihapus");
        } else {
            response.put("success", false);
            response.put("message","data gagal dihapus");
        }
        return response;
    }

    @PutMapping("computer/update")
    Map<String,Object> updateComputer (@RequestBody Computer data){
        Map<String,Object> response = new HashMap<>();
        if (computerService.updateComputer(data)){
            response.put("success",true);
            response.put("message","data berhasil diupdate");
        } else {
            response.put("success", false);
            response.put("message","data gagal diupdate");
        }
        return response;
    }
}
