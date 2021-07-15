package com.taskrandom;

import java.util.Date;

public class TaskEditor {

    public static void editName(Task task, String name) {
        task.setName(name);
    }

    // Edits Hours in deadline date of a task
    public static void editHour(Task task, int newHour) {
        Date date = task.getDeadline();
        date.setHours(newHour);

    }

    // Edits Minutes in deadline date of a task
    public static void editMinute(Task task, int newMinute) {
        Date date = task.getDeadline();
        date.setMinutes(newMinute);

    }

    // Edits hours AND minutes in deadline date of a task
    public static void editTime(Task task, int newHour, int newMinute) {
        Date date = task.getDeadline();
        date.setHours(newHour);
        date.setMinutes(newMinute);
    }

    public static void setNewDescription(Task task, String description){
        task.setDescription(description);
    }

    public static void addDescription(Task task, String description){
        task.setDescription(task.getDescription()+description);
    }

}
