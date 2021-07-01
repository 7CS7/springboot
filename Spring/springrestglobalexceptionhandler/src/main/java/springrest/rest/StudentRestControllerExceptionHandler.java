package springrest.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StudentRestControllerExceptionHandler {
	@ExceptionHandler
	public ResponseEntity<StudentErrorResponse> handleException(StudentException exc){
		
		StudentErrorResponse error=new StudentErrorResponse();
		error.setStatus(HttpStatus.NOT_FOUND.value());
		error.setMessage(exc.getMessage());
		error.setTimestamp(System.currentTimeMillis());
		
		return new ResponseEntity<StudentErrorResponse>(error,HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler
	public ResponseEntity<StudentErrorResponse> handleException(Exception exc2){
		StudentErrorResponse e=new StudentErrorResponse();
		e.setStatus(HttpStatus.BAD_REQUEST.value());
		e.setMessage(exc2.getMessage());
		e.setTimestamp(System.currentTimeMillis());
		return new ResponseEntity<StudentErrorResponse>(e,HttpStatus.NOT_FOUND);
	}
}
