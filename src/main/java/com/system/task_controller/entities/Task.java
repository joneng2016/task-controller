package com.system.task_controller.entities;

import jakarta.validation.constraints.*;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;

import java.time.LocalDate;

@Entity
@Table(name = "tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "status", nullable = false)
    private String status;

    @Column(name = "dev_time", nullable = false)
    private Integer devTime;

    @Column(name = "qa_time", nullable = false)
    private Integer qaTime;

    @Column(name = "time_done", nullable = false)
    private Integer timeDone;

    @Column(name = "responsible", nullable = false)
    private String responsible;

    @Column(name = "created_at", nullable = false)
    private LocalDate createdAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
