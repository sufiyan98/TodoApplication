package com.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Todo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int todoId;
	private String todoTitle;
	private String todoCurrent;
	private Date todoDate;

	public Todo(String todoTitle, String todoCurrent, Date todoDate) {
		super();
		this.todoTitle = todoTitle;
		this.todoCurrent = todoCurrent;
		this.todoDate = todoDate;
	}

	public String getTodoTitle() {
		return todoTitle;
	}

	public void setTodoTitle(String todoTitle) {
		this.todoTitle = todoTitle;
	}

	public String getTodoCurrent() {
		return todoCurrent;
	}

	public void setTodoCurrent(String todoCurrent) {
		this.todoCurrent = todoCurrent;
	}

	public Date getTodoDate() {
		return todoDate;
	}

	public void setTodoDate(Date todoDate) {
		this.todoDate = todoDate;
	}

	@Override
	public String toString() {
		return this.getTodoTitle() + " : " + this.getTodoCurrent();
	}
	
	public Todo() {
		// TODO Auto-generated constructor stub
		super();
	}

}
