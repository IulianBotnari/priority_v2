package com.priority.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.priority.models.Task;

public interface TaskRepository extends JpaRepository<Task, Long>{

}
