package com.spring.learn_spring_framework.examples.c1.FindMax;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
@Repository
public class MySQLDataService implements  DataService {

	@Override
	public int[] retriveData() {
		return new int[] {11, 22, 33, 44, 55};
	}
}