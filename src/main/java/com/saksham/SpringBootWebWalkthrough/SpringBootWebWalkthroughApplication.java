package com.saksham.SpringBootWebWalkthrough;

import com.saksham.SpringBootWebWalkthrough.utils.JdbcTemplateDemo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class SpringBootWebWalkthroughApplication implements CommandLineRunner {

	@Autowired
	JdbcTemplateDemo jdbcTemplateDemo;

	Logger logger = LoggerFactory.getLogger(this.getClass());

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebWalkthroughApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		logger.info("Result of findAll query: {}", jdbcTemplateDemo.findAll());
		logger.info("Result of findByid query: {}", jdbcTemplateDemo.findById(10001));
	}
}
