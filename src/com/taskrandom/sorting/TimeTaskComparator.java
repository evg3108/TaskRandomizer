package com.taskrandom.sorting;

import com.taskrandom.taskmanager.Task;

import java.util.Comparator;

public class TimeTaskComparator implements Comparator<Task> {

    @Override
    public int compare(Task task1, Task task2) {

            return (int) (task1.date.getTime()-task2.date.getTime());

    }
}
