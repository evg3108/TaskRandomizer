package com.taskrandom;

import com.taskrandom.taskManaging.Task;
import com.taskrandom.taskManaging.TaskList;
import com.taskrandom.taskManaging.TaskManager;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Launcher {
    public static void main(String[] args)  {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Task> lists = new ArrayList<>();

        for (int i=0; i<2; i++){
            lists.add(TaskManager.createTask(reader));
        }
        System.out.println(lists.size());
        TaskManager.printAllTasks(lists);

    }


}
