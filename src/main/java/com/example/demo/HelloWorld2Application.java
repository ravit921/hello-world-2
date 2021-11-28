package com.example.demo;

import java.util.LinkedList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorld2Application {

	private static List<String> slist = new LinkedList<String>();
	public static void main(String[] args) {
		slist.add("Java");
		slist.add("Programming..");
		SpringApplication.run(HelloWorld2Application.class, args);
	}

}
