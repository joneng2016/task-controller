package com.system.task_controller.entities;

import jakarta.validation.constraints.*;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;

import java.time.LocalDate;

@Entity
public class Task {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private String description;

    private String status;

    private Integer devTime;

    private Integer qaTime;

    private Integer timeDone;

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
