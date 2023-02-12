package com.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.todo.entities.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	/*
	 *  normalement cette partie doit faire avec spring security et jwt mais a cause du temps et les exams je ne pourrai pas le faire
	 */
	public User findByEmailAndPassword(String email,String password);
}
