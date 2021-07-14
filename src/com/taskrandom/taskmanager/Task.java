package com.taskrandom.taskmanager;

import java.util.Date;

public class Task {
    public String name; //  problems with privacy
    public Date date; // problems with privacy
    String description;

    public Task(String name) {
        date = new Date();
    }
}
