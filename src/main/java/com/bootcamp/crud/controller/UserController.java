package com.bootcamp.crud.controller;


import com.bootcamp.crud.model.User;
import com.bootcamp.crud.repository.UserRepository;
import com.bootcamp.crud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserService userService;

    //read
    //@GetMapping untuk method get  ("") adalah enpoint
    @GetMapping("")
    List<User> tampilkanSemuaUser() {
        return userRepository.findAll();
    }

    //create
    @PostMapping("/insert")
    public User masukkanUser(@RequestBody User dataUser){
       User hasil;
       hasil = userRepository.save(dataUser);
       return hasil;
    }

    //delete
    @DeleteMapping("/delete")
    Map<String ,Object> deleteUser(@RequestParam long id){
        Map<String,Object> response = new HashMap<>();
        if (userService.hapusUser(id)){
            response.put("success",true);
            response.put("message","data berhasil dihapus");
        } else {
            response.put("success", false);
            response.put("message","data gagal dihapus");
        }
        return response;
    }

    //update
    @PutMapping("/update")
    Map<String,Object> updateUser (@RequestBody User data){
        Map<String,Object> response = new HashMap<>();
        if (userService.updateUser(data)){
            response.put("success",true);
            response.put("message","data berhasil diupdate");
        } else {
            response.put("success", false);
            response.put("message","data gagal diupdate");
        }
        return response;
    }





}
