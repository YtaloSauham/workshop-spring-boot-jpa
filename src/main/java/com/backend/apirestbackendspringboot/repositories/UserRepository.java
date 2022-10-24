package com.backend.apirestbackendspringboot.repositories;

import com.backend.apirestbackendspringboot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User,Long> {

}
