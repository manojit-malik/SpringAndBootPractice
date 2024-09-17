package com.learn.springboot.learn_springboot;



public class Course {



	private long id;

	private String courseName;

	private String instructor;



	public Course(long id, String courseName, String instructor) {

		super();

		this.id = id;

		this.courseName = courseName;

		this.instructor = instructor;

	}



	public long getId() {

		return id;

	}



	public String getCourseName() {

		return courseName;

	}



	public String getInstructor() {

		return instructor;

	}





//	Whenever we print object of the class, the toString Method is called and all the details are printed.

	@Override

	public String toString() {

		return "Course [id = " + id + ", Course Name = " + courseName + ", Instructor Name = " + instructor;

	}



}