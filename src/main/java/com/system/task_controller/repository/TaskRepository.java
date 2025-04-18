package com.system.task_controller.repository;

import com.system.task_controller.entities.Task;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    // This interface will automatically provide CRUD operations for the Task entity
    // You can add custom query methods here if needed

    public Page<Task> findAll(Pageable pageable);
    public List<Task> findByName(String name);
    public List<Task> findByResponsible(String responsible);
}
