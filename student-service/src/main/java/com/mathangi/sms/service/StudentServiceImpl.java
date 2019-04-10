package com.mathangi.sms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mathangi.sms.model.Student;
import com.mathangi.sms.repository.StudentRepsoitory;
@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	StudentRepsoitory studentRepository;
	
	@Override
	public Student save(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student fetch() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student fetch(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

}
