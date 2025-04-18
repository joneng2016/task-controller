package com.system.task_controller.controllers.task.dto;

import jakarta.validation.constraints.*;

import java.time.LocalDate;

public class TaskDTO {

    private Integer id;

    @NotNull(message = "Name cannot be null")
    private String name;

    @NotNull(message = "Description cannot be null")
    private String description;

    @NotNull(message = "Status cannot be null")
    private String status;

    @NotNull(message = "DevTime cannot be null")
    private Integer devTime;

    @NotNull(message = "DevTime cannot be null")
    private Integer qaTime;

    @NotNull(message = "DevTime cannot be null")
    private Integer timeDone;

    @NotNull(message = "DevTime cannot be null")
    private String responsible;

    private LocalDate createdAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getDevTime() {
        return devTime;
    }

    public void setDevTime(Integer devTime) {
        this.devTime = devTime;
    }

    public Integer getQaTime() {
        return qaTime;
    }

    public void setQaTime(Integer qaTime) {
        this.qaTime = qaTime;
    }

    public Integer getTimeDone() {
        return timeDone;
    }

    public void setTimeDone(Integer timeDone) {
        this.timeDone = timeDone;
    }

    public String getResponsible() {
        return responsible;
    }

    public void setResponsible(String responsible) {
        this.responsible = responsible;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }
}
