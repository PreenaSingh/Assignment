package com.app.ems.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class EmployeeNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	private String message;

	public EmployeeNotFoundException(String message) {
		super(message);
		this.message = message;
	}

}
