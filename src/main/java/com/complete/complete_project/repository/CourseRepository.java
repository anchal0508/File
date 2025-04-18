package com.complete.complete_project.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.complete.complete_project.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
	Optional<Course> findByName(String name);
}
