package com.myrestful.webservices.exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
// class to configure the response-->json key and values
@ControllerAdvice
public class CustomizedResponse extends ResponseEntityExceptionHandler {

	@ExceptionHandler(Exception.class)
   public final ResponseEntity<Object> handleAllExceptions(Exception ex,WebRequest req)
   {
	ErrorDetails er=new ErrorDetails(LocalDateTime.now(),ex.getMessage(),req.getDescription(false));
	return new ResponseEntity(er,HttpStatus.INTERNAL_SERVER_ERROR);
   }
	@ExceptionHandler(UserNotFoundException.class)
	   public final ResponseEntity<Object> handleUserNotFoundException(Exception ex,WebRequest req)
	   {
		ErrorDetails er=new ErrorDetails(LocalDateTime.now(),ex.getMessage(),req.getDescription(false));
		return new ResponseEntity(er,HttpStatus.NOT_FOUND);
	   }

}
