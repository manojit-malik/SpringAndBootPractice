
package com.spring.learn_spring_framework.examples.c1.FindMax;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
@Repository
@Primary
public class MongoDbDataService implements DataService {


		@Override
		public int[] retriveData() {
			return new int[] {1, 2, 3, 4, 905};
		}
}
