package com.guru.model;

import java.io.Serializable;

public class LoginBean implements Serializable{

	private static final long serialVersionUID = 1L;
	private String name;
	private String email;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LoginBean()
	{
		
	}
	public int validate()
	{
		if(name.equals("admin"))
		{
			return 1;
		}
		else return 0;
	}
    
}
