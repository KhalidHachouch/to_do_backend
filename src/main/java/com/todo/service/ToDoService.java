package com.todo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.todo.entities.ToDoList;
import com.todo.repository.TodoRepository;

import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class ToDoService{
	
	private final TodoRepository todoRepository;
	
	
	public ToDoList createTodo(ToDoList toList) {
		// TODO Auto-generated method stub
		return todoRepository.save(toList);
	}

	
	public void deleteTodo(int id) {
		// TODO Auto-generated method stub
		todoRepository.deleteById(id);
	}

	
	public ToDoList markTodoCompleted(int id) {
		// TODO Auto-generated method stub
		ToDoList todo=todoRepository.findById(id).get();
		todo.setCompleted(true);
		return todoRepository.save(todo);
	}

	
	public ToDoList markTodoUncompleted(int id) {
		// TODO Auto-generated method stub
		ToDoList todo=todoRepository.findById(id).get();
		todo.setCompleted(false);
		return todoRepository.save(todo);
	}

	
	public List<ToDoList> listTodos() {
		// TODO Auto-generated method stub
		return (List<ToDoList>) todoRepository.findAll();
	}

}
