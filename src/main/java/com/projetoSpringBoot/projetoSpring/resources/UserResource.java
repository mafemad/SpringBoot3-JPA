package com.projetoSpringBoot.projetoSpring.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetoSpringBoot.projetoSpring.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "mateus", "mateus@gmail.com", "123456", "abc");
		return ResponseEntity.ok().body(u);
	}
}
