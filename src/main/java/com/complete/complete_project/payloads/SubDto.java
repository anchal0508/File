package com.complete.complete_project.payloads;

import java.util.List;

import jakarta.persistence.ElementCollection;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class SubDto {
	private int id;
	private String  name;
	private String  chapters;
	private String duration;
	private String price;
	private String onoff_mode;
	private String imageUrl;
	private String introduction;
	@ElementCollection
	private List<String>  syllabus; 
	 
}
