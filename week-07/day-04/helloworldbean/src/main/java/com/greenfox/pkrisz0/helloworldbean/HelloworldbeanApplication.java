package com.greenfox.pkrisz0.helloworldbean;

import com.greenfox.pkrisz0.helloworldbean.config.HelloWorldConfig;
import com.greenfox.pkrisz0.helloworldbean.services.HelloWorld;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class HelloworldbeanApplication {

	public static void main(String[] args) {
		//SpringApplication.run(HelloworldbeanApplication.class, args);

		ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class);

		HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
		helloWorld.setMessage("Hello World!");
		helloWorld.getMessage();
	}
}
