package com.learn.springboot.learn_jpa_and_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.learn.springboot.learn_jpa_and_hibernate.course.Course;


@Component
public class CourseJDBCCommandLineRunner implements CommandLineRunner {

	@Autowired
	private CourseJdbcRepository repository;
	
	@Override
	public void run(String... args) throws Exception {

		repository.insert(new Course (1, "Learn AWS", "With Manojit"));
		repository.insert(new Course (2, "Learn Azure", "With Manojit"));
		repository.insert(new Course (3, "Learn GCP", "With Manojit"));
		
		System.out.println(repository.findById(1));
		
		
		repository.delete(1);
		
		System.out.println(repository.findById(2));
		System.out.println(repository.findById(3));
	}
	
	

}