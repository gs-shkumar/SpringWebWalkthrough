package com.saksham.SpringBootWebWalkthrough;

import com.saksham.SpringBootWebWalkthrough.beans.Person;
import com.saksham.SpringBootWebWalkthrough.utils.JdbcTemplateDemo;
import com.saksham.SpringBootWebWalkthrough.utils.JpaDemo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Date;

//@SpringBootApplication
public class JpaDemoApplication implements CommandLineRunner {

	@Autowired
	JpaDemo jpaDemo;

	Logger logger = LoggerFactory.getLogger(this.getClass());

	public static void main(String[] args) {
		SpringApplication.run(JpaDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		logger.info("Result of findAll query: {}", jdbcTemplateDemo.findAll());
		logger.info("Result of findById query: {}", jpaDemo.findById(10001));
		logger.info("Result of insert query: {}", jpaDemo.insert(new Person("Sohan", "hyderabad", new Date(System.currentTimeMillis()))));
		logger.info("Result of update query: {}", jpaDemo.update(new Person(10001,"Akash", "Delhi", new Date(System.currentTimeMillis()))));
		logger.info("Result of deleteById query: {}", jpaDemo.deleteById(10001));
		logger.info("Result of findAll query: {}", jpaDemo.findAll());
	}
}
