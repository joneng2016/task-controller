package com.system.task_controller.controllers.task.dto;

import com.system.task_controller.entities.Task;

public class ResponsePostTask
{
    private String status;

    private Task task;

    public ResponsePostTask(String status)
    {
        this.status = status;
    }

    public ResponsePostTask(String status, Task task)
    {
        this.status = status;
        this.task = task;
    }

    public String getStatus()
    {
        return status;
    }

    public Task getTask() {return task;}
}
