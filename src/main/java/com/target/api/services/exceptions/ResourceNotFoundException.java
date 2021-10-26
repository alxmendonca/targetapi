package com.target.api.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{
	private static final long seriealVersionUID= 1L;
	
	public ResourceNotFoundException(String msg) {
		super(msg);
	}

}
