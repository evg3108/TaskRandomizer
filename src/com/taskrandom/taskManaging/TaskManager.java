package com.taskrandom.taskManaging;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TaskManager {
    private List<Task> storage = new ArrayList<>();

    public static Task createTask(BufferedReader reader) {
        String taskName="No name";
        String date="No date";
        System.out.print("Task: \t");

        try {
            taskName = reader.readLine();
        } catch (IOException exception) {
            System.out.println("Bad name error");
        }

        System.out.print("Deadline in format \"dd.MMMM.yy HH:mm\": \t");
        try {
            date = reader.readLine();
        } catch (IOException exception) {
            System.out.println("Bad date error");
        }

        Date deadline = new Date(Date.parse(date));

        return new Task(taskName, deadline);

    }


    public static void printAllTasks(ArrayList<Task> storage) {
        System.out.println("Дата создания \t Имя задачи");
        for (Task task : storage) {
            TaskList.printTask(task);
        }
    }

    public void fill(Task task) {

    }


    public void deleteTask(Task task) {

    }

}
