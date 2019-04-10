package com.mathangi.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mathangi.sms.model.Student;

public interface StudentRepsoitory extends JpaRepository<Student, Integer>{

}
