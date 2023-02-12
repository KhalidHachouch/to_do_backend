package com.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.todo.entities.ToDoList;
@Repository
public interface TodoRepository extends JpaRepository<ToDoList, Integer>{
	
}
