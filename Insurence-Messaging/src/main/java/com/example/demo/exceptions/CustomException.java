package com.example.demo.exceptions;
class Exception extends Throwable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Exception(String s){
		System.out.println(s);
		
	}
}

public class CustomException extends Exception{
	
     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CustomException(String s) {
    	 super(s);
     }
}
