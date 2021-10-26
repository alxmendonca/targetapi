package com.target.api.services.exceptions;

public class DatabaseException extends RuntimeException{
	private static final long seriealVersionUID= 1L;
	
	public DatabaseException(String msg) {
		super(msg);
	}

}


