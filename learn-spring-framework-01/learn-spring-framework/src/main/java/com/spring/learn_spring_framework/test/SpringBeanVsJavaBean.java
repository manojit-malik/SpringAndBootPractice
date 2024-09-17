package com.spring.learn_spring_framework.test;



import java.io.Serializable;



class Pojo {		//POJO - Plain Old Java Object. Any Java Object is POJO



	private String text;

	

	private int number;

	

	public String toString() {

		return text + ":" + number;

	}

	

}

				// 3rd point of a Java Bean, it implements Serializable

class JavaBean implements Serializable{			//EJB -> Enterprise Java Bean

	

	private String text;

	

	private int number;

	

//	3-Important restrictions to call something Java Bean.

	

//		1. It should have a No Argument Constructor.

	public void JavaBean () {

		// Even if we don't write it, it dosen't matter. As it will use default constructor.

		// public no-arg constructor.

	}

	

	

//		2. It should have getter and setter methods

	public String getText() {

		return text;

	}



	public void setText(String text) {

		this.text = text;

	}



	public int getNumber() {

		return number;

	}



	public void setNumber(int number) {

		this.number = number;

	}

	

	

//	3. implements Serializable





	

	

	

	

}



public class SpringBeanVsJavaBean {

	

	public static void main (String[] args) {

		

		Pojo pojo = new Pojo();

		

		System.out.println(pojo);

	}

}

