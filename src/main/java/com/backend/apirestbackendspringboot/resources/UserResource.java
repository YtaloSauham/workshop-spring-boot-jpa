 package com.backend.apirestbackendspringboot.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.apirestbackendspringboot.entities.Users;

@RestController
@RequestMapping(value ="/users")


public class UserResource {
	
	@GetMapping	
	
	public ResponseEntity<Users> findAllUsers(){
		Users u = new Users(1L,"Maria","maria@gmail.com","99999", "12345");
		
		return ResponseEntity.ok().body(u);
	}

}
