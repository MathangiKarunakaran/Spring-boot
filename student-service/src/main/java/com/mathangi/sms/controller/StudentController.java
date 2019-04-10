package com.mathangi.sms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mathangi.sms.model.Student;
import com.mathangi.sms.service.StudentService;

@RestController
@RequestMapping(value="/smscloud")
public class StudentController {
	@Autowired
	StudentService studentService;
	
	
	/*@RequestMapping(value="/hello")
	public String greeting(@RequestParam String name) {
		return "Hello from SpringBoot to"+" "+name;
	}*/
	
	/*@RequestMapping(value="/student", method=RequestMethod.POST)
	public Student save(@RequestBody Student student) {
		System.out.println(student.getName()+" "+ student.getId());
		return student;
	}*/
	
	
	@RequestMapping(value="/student", method=RequestMethod.POST)
	public Student save(@RequestBody Student student) {
		return studentService.save(student);
	}
	
	/*@RequestMapping(value="/student", method=RequestMethod.GET)
	public ResponseEntity<Student> fetch() {
		return ResponseEntity.noContent().build(); // can call different status codes here.
												   // Eg:notFound()
	}*/
}
