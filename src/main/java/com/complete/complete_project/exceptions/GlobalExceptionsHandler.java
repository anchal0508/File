package com.complete.complete_project.exceptions;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.complete.complete_project.payloads.ApiResponse;

@RestControllerAdvice
public class GlobalExceptionsHandler {

	@ExceptionHandler(ResourceNotFoundExceptions.class)
	public ResponseEntity<ApiResponse> resourseNotFoundExceptionHandler(ResourceNotFoundExceptions ex){
		String message = ex.getMessage();
		ApiResponse apiResponse  = new ApiResponse(message, false);
		return new ResponseEntity<ApiResponse>(apiResponse, HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<Map<String, String>> handleMethodArgNotValidException(MethodArgumentNotValidException ex){
		Map<String, String> resp = new HashMap<>();
		ex.getBindingResult().getAllErrors().forEach((error)->{
			String fieldName = ((FieldError)error).getField();
			String defaultMessage = error.getDefaultMessage();
			resp.put(fieldName, defaultMessage);
		});
		return new ResponseEntity<Map<String,String>>(resp, HttpStatus.BAD_REQUEST);
	}
}
