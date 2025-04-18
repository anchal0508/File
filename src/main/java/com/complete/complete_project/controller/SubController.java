package com.complete.complete_project.controller;
 
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;  
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.complete.complete_project.entity.Subject; 
import com.complete.complete_project.payloads.SubDto;
import com.complete.complete_project.services.SubService;

@RestController
@RequestMapping("/api/subjects")
//@CrossOrigin(origins = "http://localhost:3000") // Allow frontend access
public class SubController {
	
	@Autowired
	private SubService subService; 
	
	// POST - create sub
	@PostMapping("/")
	public ResponseEntity<SubDto> createSub(@RequestBody SubDto subDto){
		SubDto createdSubDto = this.subService.createSub(subDto);
		return new ResponseEntity<>(createdSubDto,HttpStatus.CREATED);
	}

	// PUT  - UPDATE
//	@PutMapping("/{subID}")
//	public ResponseEntity<SubDto> updateSub(@RequestBody SubDto subDto, @PathVariable("subID") Integer subID  ){
//		SubDto updatedSub = this.subService.updateSub(subDto, subID);
//		return ResponseEntity.ok(updatedSub);
//	}
	
	// DELETE 
//	@DeleteMapping("/{subID}")
//	public ResponseEntity<ApiResponse> deleteSub(@RequestBody SubDto subDto, @PathVariable("subID") Integer SUBID){
//		this.subService.deleteSub(SUBID);
//		return new ResponseEntity<ApiResponse>(new ApiResponse("Subject Deleted Successfully !!!", true), HttpStatus.OK);
//		
//	}
	// GET =  get subjects
//	@GetMapping("/{subID}")
//	public ResponseEntity<SubDto> getSubById(@RequestBody SubDto subDto, @PathVariable("subID") Integer SUBID){
//		return ResponseEntity.ok(this.subService.getSubById(SUBID));
//	}
	
	// GET ALL SUBJECTS
	@GetMapping
	public ResponseEntity<List<SubDto>> getAllSub(){
		return ResponseEntity.ok(this.subService.getAllSub());
	}
	
	@GetMapping("/{name}")
	public Optional<Subject> getSubjectByName(@PathVariable("name") String name){
		return subService.getSubjectByName(name);
	}
	
 
	

}

