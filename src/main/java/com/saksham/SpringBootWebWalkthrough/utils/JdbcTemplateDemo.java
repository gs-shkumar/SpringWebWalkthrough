package com.saksham.SpringBootWebWalkthrough.utils;

import com.saksham.SpringBootWebWalkthrough.annotation.TimeTaken;
import com.saksham.SpringBootWebWalkthrough.beans.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcTemplateDemo {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Person> findAll() {
        return jdbcTemplate.query("select * from person", new BeanPropertyRowMapper<Person>(Person.class));

    }

    public Person findById(int id) {
        return jdbcTemplate.queryForObject("select * from person where id=?", new Object[] {id}, new BeanPropertyRowMapper<Person>(Person.class));

    }

    public int insertData(Person person) {
        return 5;

    }

}
