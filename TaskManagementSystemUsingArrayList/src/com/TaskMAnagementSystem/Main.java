package com.TaskMAnagementSystem;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        taskManager.addTask("Complete homework");
        taskManager.addTask("Read a book");
        taskManager.displayTasks();

        taskManager.updateTask(0, "Complete math homework");
        taskManager.displayTasks();

        taskManager.removeTask(1);
        taskManager.displayTasks();
    }
}

