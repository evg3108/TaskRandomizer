package com.taskrandom.sorting;

import com.taskrandom.taskManaging.Task;

import java.util.Comparator;

public class TimeTaskComparator implements Comparator<Task> {

    @Override
    public int compare(Task task1, Task task2) {

            return (int) (task1.getDeadlineDate().getTime()-task2.getDeadlineDate().getTime());

    }
}
