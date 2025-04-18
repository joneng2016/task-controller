package com.system.task_controller;

import com.system.task_controller.entities.Task;
import com.system.task_controller.controllers.task.dto.TaskPutDTO;

public class Utils {

    private static Utils instance;

    private Utils() {
        // Private constructor to prevent instantiation
    }

    public static Utils getInstance() {
        if (instance == null) {
            instance = new Utils();
        }
        return instance;
    }

    public void updateOnTask(TaskPutDTO task, Task taskOnDb) {
        if (task.getName() != null) {
            taskOnDb.setName(task.getName());
        }

        if (task.getDescription() != null) {
            taskOnDb.setDescription(task.getDescription());
        }

        if (task.getStatus() != null) {
            taskOnDb.setStatus(task.getStatus());
        }

        if (task.getDevTime() != null) {
            taskOnDb.setDevTime(task.getDevTime());
        }

        if (task.getQaTime() != null) {
            taskOnDb.setQaTime(task.getQaTime());
        }

        if (task.getTimeDone() != null) {
            taskOnDb.setTimeDone(task.getTimeDone());
        }

        if (task.getResponsible() != null) {
            taskOnDb.setResponsible(task.getResponsible());
        }
    }
}
