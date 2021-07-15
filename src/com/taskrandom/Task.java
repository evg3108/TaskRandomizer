package com.taskrandom;

import java.util.Date;

public class Task {
    private String name;
    private Date deadline;
    private String description;
    private Date dateOfCreation;

    public Task(String name) {
        dateOfCreation = new Date();
    }

    public Task(String name, String description) {
        dateOfCreation = new Date();
        this.description = description;
    }

    public Task(String name, Date deadline) {
        dateOfCreation = new Date();
        this.deadline = deadline;
    }

    public Task(String name, String description, Date deadline) {
        dateOfCreation = new Date();
        this.description = description;
        this.deadline = deadline;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date date) {
        this.deadline = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(Date dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }
}
