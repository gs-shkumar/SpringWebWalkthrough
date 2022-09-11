package com.saksham.SpringBootWebWalkthrough.utils;

import com.saksham.SpringBootWebWalkthrough.beans.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataDemo extends JpaRepository<Person, Integer> {
}
