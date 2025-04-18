package com.complete.complete_project.entity;
 
import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "SUBJECTS")
@Getter
@Setter
@NoArgsConstructor
public class Subject {

	@Id 
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int id;
	private String  name;
	private String  chapters;
	private String duration;
	private String price;
	private String onoff_mode;
	private String imageUrl;
	private String introduction;
	@ElementCollection
	private List<String> syllabus; 
	 
	
	  
}
