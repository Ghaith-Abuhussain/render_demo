package com.example.demo_postger.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo_postger.model.Tutorial;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
    List<Tutorial> findByPublished(boolean published);

    List<Tutorial> findByTitleContaining(String title);
}