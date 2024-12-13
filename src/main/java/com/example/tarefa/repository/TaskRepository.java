package com.example.tarefa.repository;

import com.example.tarefa.models.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
