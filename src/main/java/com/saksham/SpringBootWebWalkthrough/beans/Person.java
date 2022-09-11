package com.saksham.SpringBootWebWalkthrough.beans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="person")
@NamedQuery(name = "find_all_person", query = "select p from Person p")
public class Person {
    @Id
    @GeneratedValue
    private int id;

    @Column(name="name")
    private String name;
    private String location;
    private Date birthDate;

    @Override
    public String toString() {
        return System.out.printf("id: %d name: %s, location: %s, birthDate %s \n", this.id, this.name, this.location, this.birthDate).toString();
    }

    public Person(String name, String location, Date birthDate) {
        this.name = name;
        this.location = location;
        this.birthDate = birthDate;
    }

}
