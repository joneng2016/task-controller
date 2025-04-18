package com.system.task_controller.controllers.task.dto;

import java.util.List;
import com.system.task_controller.entities.Task;

public class ResponseOfFind {

    private String message;
    private List<Task> tasks;

    public ResponseOfFind(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
}
