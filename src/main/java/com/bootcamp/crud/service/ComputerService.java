package com.bootcamp.crud.service;

import com.bootcamp.crud.model.Computer;
import com.bootcamp.crud.repository.ComputerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComputerService {
    @Autowired
    ComputerRepository computerRepository;

    public boolean deleteComputer(long id) {
        Computer hasil;
        hasil = computerRepository.findById(id);
        if(hasil != null){
            computerRepository.delete(hasil);
            return true;
        } else {
            return false;
        }
    }

    public boolean updateComputer(Computer data) {
        Computer hasil = computerRepository.findById(data.getId());
        if (hasil != null){
            computerRepository.save(data);
            return true;
        }else{
            return false;
        }
    }
}
