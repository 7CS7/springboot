package springrest.rest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springrest.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {
	List <Student> studentList;
	 @PostConstruct
	public void loadData() {
	 studentList=new ArrayList<Student>();
	studentList.add(new Student(1,"abc","def"));
	studentList.add(new Student(2,"pqr","st"));
	studentList.add(new Student(3,"xyz","uv"));
	
	}
	@GetMapping("/students")
	public List<Student> getStudent(){
		studentList=new ArrayList<Student>();
		studentList.add(new Student(1,"abc","def"));
		studentList.add(new Student(2,"pqr","st"));
		studentList.add(new Student(3,"xyz","uv"));
		return studentList;
	}
	
	@GetMapping("/students/{studentId}")
	public Student getStudent(@PathVariable int studentId) {
		 if((studentId>=studentList.size()) || (studentId<0)) {
			 throw new StudentException("Student id not found - "+studentId);
		 }
		return studentList.get(studentId);
		
	}
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
