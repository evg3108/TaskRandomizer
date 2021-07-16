package com.taskrandom.sorting;

import com.taskrandom.taskManaging.Task;

import java.util.Comparator;

public class NameTaskComparator implements Comparator<Task> {

    @Override
    public int compare(Task o1, Task o2) {
        return o1.getName().length()-o2.getName().length();
    }
}
