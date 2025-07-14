package com.jenkins.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static Logger  logger = LoggerFactory.getLogger(DemoApplication.class);
	public static void main(String[] args) {
		logger.info("application satrted");
		logger.info("application log-2");
		SpringApplication.run(DemoApplication.class, args);
	}

}
