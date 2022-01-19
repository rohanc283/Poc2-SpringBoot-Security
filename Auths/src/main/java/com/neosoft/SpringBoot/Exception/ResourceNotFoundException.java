package com.neosoft.SpringBoot.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import lombok.Getter;

@ResponseStatus(value = HttpStatus.NOT_FOUND)

public class ResourceNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private @Getter String resourcename;
	private @Getter String fieldName;
	private @Getter Object fieldValue;
	public ResourceNotFoundException(String resourcename, String fieldName, Object fieldValue) {
		super(resourcename+" Not Found with: "+fieldName+" "+fieldValue);
		this.resourcename = resourcename;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}
	
	
	

}
