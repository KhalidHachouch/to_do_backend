package com.todo.api;

import java.util.List;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.todo.entities.ToDoList;
import com.todo.service.ToDoService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
public class TodoController {
	private final ToDoService toDoService;

	@PostMapping("/save")
	@ResponseStatus(code = HttpStatus.CREATED)
	public ToDoList addTodo(@RequestBody ToDoList tolist) {
		return toDoService.createTodo(tolist); 
	}
	@PutMapping("/completed/{id}")
	@ResponseStatus(code = HttpStatus.OK)
	public ToDoList markedToDoCompleted(@PathVariable int id) {
		return toDoService.markTodoCompleted(id);
	}
	@PutMapping("/uncompleted/{id}")
	@ResponseStatus(code = HttpStatus.OK)
	public ToDoList markedToDoUnCompleted(@PathVariable int id) {
		return toDoService.markTodoUncompleted(id);
	}
	@DeleteMapping("/delete")
	public void delete(@RequestParam("id") int id) {
		toDoService.deleteTodo(id);
		
	}
	@GetMapping("/all")
	@ResponseStatus(code = HttpStatus.OK)
	public List<ToDoList>lists(){
		return toDoService.listTodos();
	}
}
