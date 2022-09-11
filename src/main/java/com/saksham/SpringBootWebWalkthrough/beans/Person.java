package com.saksham.SpringBootWebWalkthrough.beans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Person {
    private long id;
    private String name;
    private int age;
}
