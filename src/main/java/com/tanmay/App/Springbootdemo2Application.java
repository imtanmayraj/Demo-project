package com.tanmay.App;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Springbootdemo2Application {

	public static void main(String[] args) {
//		SpringApplication.run(Springbootdemo2Application.class, args);
		ApplicationContext context = SpringApplication.run(Springbootdemo2Application.class, args);
//		System.out.println("hello tanmay");

//		Alien obj=new Alien();
//		obj.code();

//		Alien obj=context.getBean(Alien.class);
//		obj.code();

		Laptop lap=context.getBean(Laptop.class);
		lap.compile();

		;



	}

}
