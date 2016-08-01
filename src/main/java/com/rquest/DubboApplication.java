package com.rquest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:dubbo-consumer.xml")
public class DubboApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(DubboApplication.class, args);
	}
}
