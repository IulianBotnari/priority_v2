package com.priority.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.priority.models.Image;

public interface ImageRepository extends JpaRepository<Image, Long>{

}
