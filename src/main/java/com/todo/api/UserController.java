package com.todo.api;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.todo.entities.User;
import com.todo.service.UserService;

import lombok.RequiredArgsConstructor;
@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequiredArgsConstructor
public class UserController {
	/*
	 *  normalement cette partie doit faire avec spring security et jwt mais a cause du temps et les exams je ne pourrai pas le faire
	 */
	private final UserService userService;
	
	@PostMapping("/saveuser")
	public User createUser(@RequestBody User user) {
		return userService.createUser(user);
	}
	@GetMapping("/login")
	
	public User login(@RequestParam("email") String email,@RequestParam("password") String password) {
		return userService.findByEmailAndPassword(email, password);
	}
	
	
}
