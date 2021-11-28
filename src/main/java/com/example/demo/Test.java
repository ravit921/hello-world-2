package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Test implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		int i=10;
		System.out.println("hello world 2nd line"+i);
	}

}
