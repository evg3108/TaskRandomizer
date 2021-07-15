package com.taskrandom;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;

public class TaskManager {
    private HashMap<Date, Task> storage = new HashMap<>();

    public void addTask(BufferedReader reader){
        System.out.print("Entry name: ");
        try {
            String taskName = reader.readLine();
            storage.put(new Date(),new Task(taskName));
            System.out.println("Successfully added to storage");
        } catch (IOException exception) {
            System.out.println("Bad name error");
        }
    }


    public void deleteTask(Task task){

    }

}
