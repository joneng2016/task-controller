package com.system.task_controller.controllers.task;

import com.system.task_controller.controllers.task.dto.ResponsePostTask;
import com.system.task_controller.entities.Task;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import com.system.task_controller.repository.TaskRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/task")
public class TaskController {

    private final TaskRepository taskRepository;

    @Autowired
    public TaskController(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @GetMapping
    public String getData() {
        return "Hello, Woxxxrld!";
    }

    @PostMapping
    public ResponsePostTask postTask(@Valid @RequestBody Task task) {
        ResponsePostTask responsePostTask;

        try {
            this.taskRepository.save(task);

            responsePostTask = new ResponsePostTask("Task created successfully " + task.getName());
        } catch (Exception e) {
            responsePostTask = new ResponsePostTask("Error creating task: " + e.getMessage());
        }

        return responsePostTask;
    }
}
