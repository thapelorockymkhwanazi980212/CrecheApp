package com.example.CrechApp.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ChildApplication {
 
 @Id   
 @GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id; //id for each application

private String name;
private int age;
private Date applicationDate;

//getters and setters

public Long getId() {
    return id;
}
public void setId(Long id) {
    this.id = id;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public int getAge() {
    return age;
}
public void setAge(int age) {
    this.age = age;
}
public Date getApplicationDate() {
    return applicationDate;
}
public void setApplicationDate(Date applicationDate) {
    this.applicationDate = applicationDate;
}


}
