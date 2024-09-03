package com.myrestful.webservices.mypack;

public class Hello {
 
	private String message;
	private int id;
	public Hello()
	{
		
	}
	public Hello(String message,int id)
	{
		this.message=message;
		this.id=id;
	}
	public Hello(String message)
	{
		this.message="Hello User  "+message;
	}
	public String getMessage() {
		return message;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "Hello [message=" + message + "]";
	}
}
