package com.complete.complete_project.exceptions;

public class ResourceNotFoundExceptions extends RuntimeException {

	String resourceName;
	String fieldName; 
	long fieldValue;
	public ResourceNotFoundExceptions(String resourceName, String fieldName, long fieldValue) {
		super(String.format("%s field not found with %s : %s", resourceName, fieldName, fieldValue));
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	} 
}
