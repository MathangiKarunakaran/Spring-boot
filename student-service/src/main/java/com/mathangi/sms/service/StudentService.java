package com.mathangi.sms.service;

import com.mathangi.sms.model.Student;

public interface StudentService {

	Student save(Student student);
	Student fetch();
	Student fetch(Student student);
}
