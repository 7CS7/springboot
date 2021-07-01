package com.cs.springjackson;

import java.io.File;

import com.cs.springjackson.demo.Student;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    
    {
        try {
        	ObjectMapper mapper=new ObjectMapper();
        	Student s=mapper.readValue(new File("data/sample-full.json"), Student.class);
        	
        	System.out.println("First Name "+s.getFirstName());
        	System.out.println("Last Name "+s.getLastName());
        	System.out.println("Address "+s.getAddress());
        	
        	for(String a:s.getLanguages())System.out.print(a+" ");
        	System.out.println("Id "+s.getId());
        }catch(Exception e) {
        	e.printStackTrace();
        }
    }
}
