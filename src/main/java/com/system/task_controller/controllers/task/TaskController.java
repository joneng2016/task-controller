package com.system.task_controller.controllers.task;

import com.system.task_controller.controllers.task.dto.ResponsePostTask;
import com.system.task_controller.controllers.task.dto.ResponseOfFind;
import com.system.task_controller.entities.Task;

import java.util.Optional;

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

import java.util.ArrayList;
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
        return taskRepository.findAll(PageRequest.of(page, size)).getContent();
    }

    @GetMapping("/find")
    public ResponseOfFind findTaskById(
        @RequestParam(defaultValue = "0") Long id,
        @RequestParam(defaultValue = "") String taskName,
        @RequestParam(defaultValue = "") String responsible
    )
    {
        ResponseOfFind response = new ResponseOfFind("success");

        try {
            List<Task> listResponse = hasToFindByIdTask(id) ?
                    changeOneTaskToList(taskRepository.findById(id)) :
                    verifyOthersAttributes(taskName, responsible);

            if (listResponse.isEmpty()) {
                throw new RuntimeException("Task not found");
            }

            response.setTasks(listResponse);

        } catch (Exception e) {
            response.setMessage(e.getMessage());;
        }

        return response;
    }

    public List<Task> verifyOthersAttributes(
            String taskName,
            String responsible
    ) {
      return hasToFindByNameTask(taskName) ?
              taskRepository.findByName(taskName) :
              taskRepository.findByResponsible(responsible);
    }

    private Boolean hasToFindByIdTask(Long id)
    {
        return id != 0;
    }

    private Boolean hasToFindByNameTask(String taskName)
    {
        return taskName != "";
    }


    private List<Task> changeOneTaskToList(
            Optional<Task> optionalTask
    ) {
        if (optionalTask.isEmpty()) {
            throw new RuntimeException("Task not found by this id");
        }

        List<Task> listResponse = new ArrayList<>();
        listResponse.add(optionalTask.get());

        return listResponse;
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
