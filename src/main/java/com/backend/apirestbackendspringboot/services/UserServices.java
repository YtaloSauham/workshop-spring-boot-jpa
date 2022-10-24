package com.backend.apirestbackendspringboot.services;

import com.backend.apirestbackendspringboot.entities.Users;
import com.backend.apirestbackendspringboot.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServices {

    @Autowired
    private UserRepository repository;

    public List<Users> findAll(){
        return repository.findAll();
    }

    public Users findById(Long id) {
         Optional<Users> obj = repository.findById(id);
         return obj.get();
    }
}
