package com.myrestful.webservices.exceptions;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ErrorDetails {
  
	private LocalDateTime tstmp;
	private String message;
	private String details;
	public ErrorDetails(LocalDateTime tstmp, String message, String details) {
		super();
		this.tstmp = tstmp;
		this.message = message;
		this.details = details;
	}
	public LocalDateTime getTstmp() {
		return tstmp;
	}
	public String getMessage() {
		return message;
	}
	public String getDetails() {
		return details;
	}
	
}
