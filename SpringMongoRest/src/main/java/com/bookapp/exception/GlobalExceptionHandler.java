package com.bookapp.exception;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.TypeMismatchException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

	@Override
	protected ResponseEntity<Object> handleHttpRequestMethodNotSupported(HttpRequestMethodNotSupportedException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		// TODO Auto-generated method stub
		
		String message =  ex.getMessage();
		LocalDateTime timestamp = LocalDateTime.now();
		List<String> details=Arrays.asList("Wrong method name ","not supported");
		APIErrors errors = new APIErrors(message,timestamp,status,details);
		return ResponseEntity.status(status).body(errors);
	
	}

	@Override
	protected ResponseEntity<Object> handleHttpMediaTypeNotSupported(HttpMediaTypeNotSupportedException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		// TODO Auto-generated method stub
		//return super.handleHttpMediaTypeNotSupported(ex, headers, status, request);
	
		String message =  ex.getMessage();
		LocalDateTime timestamp = LocalDateTime.now();
		List<String> details=Arrays.asList("Media Type ","not supported");
		APIErrors errors = new APIErrors(message,timestamp,status,details);
		return ResponseEntity.status(status).body(errors);
	
	}

	@Override
	protected ResponseEntity<Object> handleMissingPathVariable(MissingPathVariableException ex, HttpHeaders headers,
			HttpStatus status, WebRequest request) {
		// TODO Auto-generated method stub
		//return super.handleMissingPathVariable(ex, headers, status, request);
	
		String message =  ex.getMessage();
		LocalDateTime timestamp = LocalDateTime.now();
		List<String> details=Arrays.asList("PathVariable is Missing ","variable mismatch");
		APIErrors errors = new APIErrors(message,timestamp,status,details);
		return ResponseEntity.status(status).body(errors);
	
	}

	@Override
	protected ResponseEntity<Object> handleMissingServletRequestParameter(MissingServletRequestParameterException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		// TODO Auto-generated method stub
		//return super.handleMissingServletRequestParameter(ex, headers, status, request);
	
		String message =  ex.getMessage();
		LocalDateTime timestamp = LocalDateTime.now();
		List<String> details=Arrays.asList("Wrong Parameter ","Parameter not supported");
		APIErrors errors = new APIErrors(message,timestamp,status,details);
		return ResponseEntity.status(status).body(errors);
	}

	@Override
	protected ResponseEntity<Object> handleTypeMismatch(TypeMismatchException ex, HttpHeaders headers,
			HttpStatus status, WebRequest request) {
		// TODO Auto-generated method stub
		return super.handleTypeMismatch(ex, headers, status, request);
	}

	public GlobalExceptionHandler() {
		// TODO Auto-generated constructor stub
	}
	@ExceptionHandler(BookNotFoundException.class)
	public ResponseEntity<Object>
	handleBookException(BookNotFoundException ex){
		String message =  ex.getMessage();
		LocalDateTime timestamp = LocalDateTime.now();
		List<String> details=Arrays.asList("message");
		APIErrors errors = new APIErrors(message,timestamp,HttpStatus.INTERNAL_SERVER_ERROR,details);
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errors);
	}

}
