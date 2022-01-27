package com.bootcamp.crud.repository;

import com.bootcamp.crud.model.Computer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComputerRepository extends JpaRepository<Computer,Integer> {
    Computer findById(long id);
}
