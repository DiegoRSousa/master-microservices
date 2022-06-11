package com.diego.accounts.handler;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.server.ResponseStatusException;

@ControllerAdvice
public class ControllerExceptionHandler {

	@ExceptionHandler(ResponseStatusException.class)
	public ResponseEntity<StandardError> responseStatus(ResponseStatusException e, HttpServletRequest request) {
		StandardError error = new StandardError(System.currentTimeMillis(), e.getReason(), 
				e.getMessage(), request.getRequestURI());
		return ResponseEntity.status(e.getStatus().value()).body(error);
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<StandardError> validation(MethodArgumentNotValidException e, HttpServletRequest request) {
		ValidationError err = new ValidationError(System.currentTimeMillis(), "Validation Error", 
				e.getMessage(), request.getRequestURI());
		for(FieldError f : e.getBindingResult().getFieldErrors()) {
			err.addError(f.getField(), f.getDefaultMessage());
		}
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(err);
	}
	
	@ExceptionHandler(IllegalStateException.class)
	public ResponseEntity<String> illegalStateException(IllegalStateException e, HttpServletRequest request) {
		
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
	}
}
