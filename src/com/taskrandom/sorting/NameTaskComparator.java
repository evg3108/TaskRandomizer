package com.taskrandom.sorting;

import com.taskrandom.taskmanager.Task;

import java.util.Comparator;

public class NameTaskComparator implements Comparator<Task> {

    @Override
    public int compare(Task o1, Task o2) {
        return o1.name.length()-o2.name.length();
    }
}
