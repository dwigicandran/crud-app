package com.bootcamp.crud.repository;


import com.bootcamp.crud.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository <User, Integer> {
    User findById (long id);

}



