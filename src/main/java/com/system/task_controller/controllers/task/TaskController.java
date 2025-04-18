package com.system.task_controller.controllers.task;

import com.system.task_controller.controllers.task.dto.ResponsePostTask;
import com.system.task_controller.entities.Task;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import com.system.task_controller.repository.TaskRepository;

import jakarta.validation.Valid;

import java.lang.annotation.Repeatable;
import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {
    private final TaskRepository taskRepository;

    @Autowired
    public TaskController(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @GetMapping
    public List<Task> getData(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "5") int size
    ) {
        Page<Task> tasks = taskRepository.findAll(PageRequest.of(page, size));

        return tasks.getContent();
    }

    @PostMapping
    public ResponsePostTask postTask(@Valid @RequestBody Task task) {
        ResponsePostTask responsePostTask;

        try {
            Task taskOnDb = taskRepository.save(task);

            responsePostTask = new ResponsePostTask(
                    "Task created successfully " + task.getName(),
                    taskOnDb
            );
        } catch (Exception e) {
            responsePostTask = new ResponsePostTask("Error creating task: " + e.getMessage());
        }

        return responsePostTask;
    }
}
