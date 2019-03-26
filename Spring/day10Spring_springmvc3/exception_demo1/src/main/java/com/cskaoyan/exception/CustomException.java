package com.cskaoyan.exception;

/**
 * Created by little Stone
 * Date 2019/3/26 Time 10:50
 */
public class CustomException extends Exception {
	private static final long serialVersionUID = 3674172080269953075L;

	String message;

	@Override
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public CustomException(String message)
	{
		super(message);
		this.message = message;
	}
}
