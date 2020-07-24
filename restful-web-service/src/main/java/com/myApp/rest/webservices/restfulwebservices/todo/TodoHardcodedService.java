package com.myApp.rest.webservices.restfulwebservices.todo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoHardcodedService {
	
	// for having static todos list
	private static List<Todo> todos = new ArrayList<Todo>(); // acting like a DB
	private static int idCounter = 0;
	
	static {
		todos.add(new Todo(++idCounter,"todo1", "Learn java", new Date(), false ));
		todos.add(new Todo(++idCounter,"todo2", "Learn about Microservices", new Date(), false ));
		todos.add(new Todo(++idCounter,"todo3", "Learn Angular", new Date(), true ));
		todos.add(new Todo(++idCounter,"todo4", "Learn javaEE", new Date(), false ));
		todos.add(new Todo(++idCounter,"todo5", "Learn to Dance", new Date(), true ));
		todos.add(new Todo(++idCounter,"todo11", "Learn about Spring Boot", new Date(), false ));
	}
	public List<Todo> findAll() {
		return todos;
	}
	
	public Todo save(Todo todo) {
		if (todo.getId() ==-1 || todo.getId() ==0) {
			todo.setId(++idCounter);
			todos.add(todo);
			
		} else {
			deleteById(todo.getId());
			todos.add(todo);
		}
		return todo;
	}

	public Todo deleteById(long id) {
		Todo todo = findById(id);
		
		if(todo==null) return null;
		
		if(todos.remove(todo)) {
		return todo;
		}
		
		return null;
	}

	public Todo findById(long id) {

		for(Todo todo: todos) {
			if(todo.getId() == id) {
				return todo;
			}
		}
		return null;
	}
}
