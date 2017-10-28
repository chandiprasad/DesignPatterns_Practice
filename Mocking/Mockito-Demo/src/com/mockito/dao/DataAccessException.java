package com.mockito.dao;

@SuppressWarnings("serial")
public class DataAccessException extends Exception {
	private Exception ex;
	public DataAccessException(Exception ex){
		this.ex=ex;
	}

	public String getMessage(){
		return ex.getMessage();
	}
	
}
