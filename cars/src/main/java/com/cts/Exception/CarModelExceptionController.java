package com.cts.Exception;


import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CarModelExceptionController
{
	@Value("${car_not_found}")
	private String carNotFound;
	
	@ExceptionHandler(value=CarModelNotFoundException.class)
	public ResponseEntity<Object> exception(CarModelNotFoundException exception)
	{
		return new ResponseEntity<>(carNotFound, HttpStatus.NOT_FOUND);
	}
	
	
	
//	 @ExceptionHandler({CarModelNotFoundException.class})
//	    public void handleNotFoundException(HttpServletResponse response) throws IOException {
//		  response.sendError(HttpStatus.NOT_FOUND.value());
//	    }
//	
	
	
	
}