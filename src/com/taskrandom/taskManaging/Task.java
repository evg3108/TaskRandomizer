package com.taskrandom.taskManaging;

import com.taskrandom.format.MonthFormatSymbols;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Task {
    private String name;
    private Date deadline;
    private String description;
    private Date dateOfCreation;
    private String nameOfList;
    private MonthFormatSymbols monthFormat = new MonthFormatSymbols();
    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM YY", monthFormat);

    public Task(String name) {
        this.name = name;
        dateOfCreation = new Date();
    }

    public Task(String name, String description) {
        this.name = name;
        dateOfCreation = new Date();
        this.description = description;
    }

    public Task(String name, Date deadline) {
        this.name = name;
        dateOfCreation = new Date();
        this.deadline = deadline;
    }

    public Task(String name, String description, Date deadline) {
        this.name = name;
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

    public Date getDeadlineDate(){
        return deadline;
    }

    public String getDeadline() {
        return dateFormat.format(deadline);
    }

    public void setDeadline(Date date) {
        this.deadline = date;
    }

    public String getDescription() {
        return new String(description);
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateOfCreation() {
        return dateFormat.format(dateOfCreation);
    }

    public void setDateOfCreation(Date dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public void editName(String name) {
        this.name = name;
    }

    // Edits Hours in deadline date of a task
    public void editHour(int newHour) {
        deadline.setHours(newHour);

    }

    // Edits Minutes in deadline date of a task
    public void editMinute(int newMinute) {
        deadline.setMinutes(newMinute);

    }

    // Edits hours AND minutes in deadline date of a task
    public void editTime(int newHour, int newMinute) {
        deadline.setHours(newHour);
        deadline.setMinutes(newMinute);
    }

    public void setNewDescription(String description){
        this.description = description;
    }

    public void addDescription(String description){
        this.description += description;
    }

}
