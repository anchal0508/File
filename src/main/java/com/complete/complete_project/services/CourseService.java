package com.complete.complete_project.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.complete.complete_project.entity.Course;
import com.complete.complete_project.repository.CourseRepository;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;
	
	public List<Course> getAllCourses(){
		return 	courseRepository.findAll();
	}
	
	public Optional<Course> getCourseByName(String name){
		return courseRepository.findByName(name);
	}
	
}
