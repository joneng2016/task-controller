package com.system.task_controller.repository;

import com.system.task_controller.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    // This interface will automatically provide CRUD operations for the Task entity
    // You can add custom query methods here if needed
}
