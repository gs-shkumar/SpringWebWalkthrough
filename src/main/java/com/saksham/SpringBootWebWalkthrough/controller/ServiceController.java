package com.saksham.SpringBootWebWalkthrough.controller;

import ch.qos.logback.core.util.TimeUtil;
import com.saksham.SpringBootWebWalkthrough.annotation.TimeTaken;
import com.saksham.SpringBootWebWalkthrough.beans.Person;
import com.saksham.SpringBootWebWalkthrough.beans.ThreadDao;
import com.saksham.SpringBootWebWalkthrough.utils.DaoClass;
import com.saksham.SpringBootWebWalkthrough.utils.ServiceClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
public class ServiceController {

    private final Logger logger = Logger.getLogger("logger");

    @Autowired
    ServiceClass serviceClass;

    @GetMapping("/person")
    @TimeTaken
    public Person getPerson() throws InterruptedException {
        Person person = new Person(1845, "Kh. Sohan Singh", "Hyderabad", new Date(new Timestamp(System.currentTimeMillis()).getTime()));
        ThreadDao dao = serviceClass.performService();
        System.out.println(dao.getThreadName() + "////" + dao.getDao());
        return person;
    }
}
