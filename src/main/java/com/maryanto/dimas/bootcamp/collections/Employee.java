package com.maryanto.dimas.bootcamp.collections;

import java.sql.Date;
import java.util.UUID;

public class Employee {

    

    private String id;
    private String name;
    private String jobTitle;
    private Date birthdate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public Employee() {
    }

    public Employee(String name, String jobTitle, Date birthdate) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.jobTitle = jobTitle;
        this.birthdate = birthdate;
    }
    
}