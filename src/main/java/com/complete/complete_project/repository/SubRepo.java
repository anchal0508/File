package com.complete.complete_project.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.complete.complete_project.entity.Subject;

public interface SubRepo extends JpaRepository<Subject, Long> {
	Optional<Subject> findByName(String name);

}