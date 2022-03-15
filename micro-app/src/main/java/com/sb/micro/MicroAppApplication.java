package com.sb.micro;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.util.SystemInfo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MicroAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroAppApplication.class, args);
		System.out.println("Hello World");
	}

}
