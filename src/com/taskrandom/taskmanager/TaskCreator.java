package com.taskrandom.taskmanager;

import java.util.Date;

public class TaskCreator {
    public Task createTask (String name) {
        return new Task (name);
    }
}
