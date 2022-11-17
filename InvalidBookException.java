package com.book.exception;

public class InvalidBookException extends Exception {
	
	public InvalidBookException() {
		System.out.println("Invalid book detail");
	}
	
	public InvalidBookException(String message) {
		super(message);
	}
}
