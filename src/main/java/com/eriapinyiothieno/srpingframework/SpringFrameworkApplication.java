package com.eriapinyiothieno.srpingframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringFrameworkApplication {
	//What are beans?
	//What are the dependencies of a bean?
	//Where to search for beans? => No need to define this in springboot
		//Component scan
	//Application context manages the beans

	public static void main(String[] args) {

		ApplicationContext context =  SpringApplication.run(SpringFrameworkApplication.class, args);

		BinarySearchImpl binarySearch = context.getBean(BinarySearchImpl.class);
		int result = binarySearch.binarySearch(new int[]{12, 4, 3}, 3);
		System.out.println(result);
	}

}
