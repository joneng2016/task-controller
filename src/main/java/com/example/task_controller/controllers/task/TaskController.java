package com.example.task_controller.controllers.task;

import com.example.task_controller.controllers.task.dto.ResponsePostTask;
import com.example.task_controller.controllers.task.dto.Task;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RequestMapping("/task")
@RestController
public class TaskController {

    @GetMapping
    public String getData() {
        return "Hello, Woxxxrld!";
    }

    @PostMapping
    public ResponsePostTask postTask(@Valid @RequestBody Task task) {
        ResponsePostTask responsePostTask;
        try {

            responsePostTask = new ResponsePostTask("Task created successfully " + task.getName());
        } catch (Exception e) {
            responsePostTask = new ResponsePostTask("Error creating task: " + e.getMessage());
        }

        return responsePostTask;
    }
}
