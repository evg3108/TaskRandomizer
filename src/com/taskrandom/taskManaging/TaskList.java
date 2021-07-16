package com.taskrandom.taskManaging;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class TaskList {
    private String listName;
    private ArrayList<Task> list;
    private final Date dateOfCreation;

    public TaskList(String listName) {
        this.listName = listName;
        dateOfCreation = new Date();
        list = new ArrayList<>();
    }

    public String getListName() {
        return new String(listName);
    }

    public void editListName(String newName) {
        listName = newName;
    }

    public Date getDateOfCreation() {
        return null; // return formatted date as a String
    }

        public void addTask(Task task) {
        list.add(task);
    }

    public void removeTask(Task task) {
        list.remove(task);
    }

    private boolean contains(Task task) {
        return list.contains(task);
    }

    public Task findTask(String name) {
        for (Task task : list) {
            if (task.getName().equals(name)) {
                return task;
            }
        }
        return null;
    }

    public static void printTask(Task task) {

        System.out.println(task.getDateOfCreation() + "\t\t" + task.getName());
    }

}
