package com.system.task_controller.controllers.task.dto;

public class ResponsePostTask
{
    private String status;

    public ResponsePostTask(String status)
    {
        this.status = status;
    }

    public String getStatus()
    {
        return status;
    }
}
