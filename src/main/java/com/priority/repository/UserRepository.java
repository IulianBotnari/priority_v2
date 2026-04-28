package com.priority.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.priority.models.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
