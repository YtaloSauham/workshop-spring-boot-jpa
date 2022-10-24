package com.backend.apirestbackendspringboot.repositories;

import com.backend.apirestbackendspringboot.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<Users,Long> {

}
