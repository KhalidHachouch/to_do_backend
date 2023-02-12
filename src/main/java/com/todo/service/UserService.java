package com.todo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.entities.User;
import com.todo.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
	/*
	 *  normalement cette partie doit faire avec spring security et jwt mais a cause du temps et les exams je ne pourrai pas le faire
	 */
	
	@Autowired
	 UserRepository userRepository;
	
	public User createUser(User user) {
		return userRepository.save(user);
	}
	
	public User findByEmailAndPassword(String email,String password) {
		return userRepository.findByEmailAndPassword(email, password);
	}
}
