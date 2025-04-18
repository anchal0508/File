package com.complete.complete_project.entity;
 
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String name;
private String introduction;
private String syllabus;
private String imageUrl;


	
}
