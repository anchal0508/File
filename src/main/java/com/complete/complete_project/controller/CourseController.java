package com.complete.complete_project.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.complete.complete_project.entity.Course;
import com.complete.complete_project.services.CourseService;

@RestController
@RequestMapping("/api/courses")
@CrossOrigin(origins = "http://localhost:3000") // Allow frontend access
public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }
	@GetMapping("/{name}")
    public Optional<Course> getCourseByName(@PathVariable String name) {
        return courseService.getCourseByName(name);
    }
	

}
