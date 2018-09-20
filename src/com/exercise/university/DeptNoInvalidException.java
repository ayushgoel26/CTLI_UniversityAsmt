package com.exercise.university;

public class DeptNoInvalidException extends Exception {
	private String message;
	
	public DeptNoInvalidException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return this.message;
	}
	
}
