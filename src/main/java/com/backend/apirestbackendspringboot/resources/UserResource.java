 package com.backend.apirestbackendspringboot.resources;

import com.backend.apirestbackendspringboot.services.UserServices;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.apirestbackendspringboot.entities.Users;

import java.util.List;

 @RestController
@RequestMapping(value ="/users")


public class UserResource {

	 @Autowired
	 private UserServices service;
	@GetMapping	
	
	public ResponseEntity<List<Users>> findAllUsers(){
		List<Users> list = service.findAll();
		
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	 public ResponseEntity<Users> findById(@PathVariable Long id){
		Users obj = service.findById(id);
		return  ResponseEntity.ok().body(obj);
	}

}
