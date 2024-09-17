package com.learn.springboot.learn_springboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CourseController {
	
	// http://localhost:8080/courses
	// To return back:- Course: id, name, author
	
	@RequestMapping("/courses")
	public List<Course> retriveAllCourses() {
		return Arrays.asList(
				new Course(1, "Learn AWS", "with Manojit"),
				new Course(2, "Learn DevOps", "with Manojit"),
				new Course(3, "Learn Azure", "with Manojit"),
				new Course(4, "Learn GCP", "with Manojit")
				);
	}

}
