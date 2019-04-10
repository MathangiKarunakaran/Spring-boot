package com.mathangi.sms.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mathangi.sms.model.Student;

@RestController
@RequestMapping(value="/smscloud")
public class StudentService {
	
	@RequestMapping(value="/hello")
	public String greeting(@RequestParam String name) {
		return "Hello from SpringBoot to"+" "+name;
	}
	
	@RequestMapping(value="/student", method=RequestMethod.POST)
	public Student save(@RequestBody Student student) {
		System.out.println(student.getName()+" "+ student.getId());
		return student;
	}
	
	@RequestMapping(value="/student", method=RequestMethod.GET)
	public ResponseEntity<Student> fetch() {
		return ResponseEntity.noContent().build(); // can call different status codes here. Eg:notFound()
		
	}


}
