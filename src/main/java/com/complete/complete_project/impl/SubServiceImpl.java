package com.complete.complete_project.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.complete.complete_project.entity.Subject; 
import com.complete.complete_project.payloads.SubDto;
import com.complete.complete_project.repository.SubRepo;
import com.complete.complete_project.services.SubService;

@Service
public class SubServiceImpl implements SubService {

	@Autowired
	private SubRepo subRepo;
	
	@Autowired
	private ModelMapper modelMapper; 
	
	@Override
	public SubDto createSub(SubDto subDto) {
		Subject sub = this.DtoTosubject(subDto);
		Subject savedSub = this.subRepo.save(sub);
		 return this.subjectTosubDto(savedSub); 
	}

	/*@Override
	public void deleteSub(Integer subjectId) {
	
		Subject subject = this.subRepo.findById(subjectId).orElseThrow(()-> new ResourceNotFoundExceptions("Subject", " id ", subjectId));
		this.subRepo.delete(subject);

	}

	@Override
	public SubDto updateSub(SubDto subDto, Integer subjectId) {
		Subject subject = this.subRepo.findById(subjectId).orElseThrow(()-> new ResourceNotFoundExceptions("subject", "id", subjectId));
		subject = this.modelMapper.map(subDto,Subject.class);
		Subject savedSub = this.subRepo.save(subject);
		return this.subjectTosubDto(savedSub);
	}
*/
	@Override
	public List<SubDto> getAllSub() {
		List<Subject> subjects = this.subRepo.findAll();
		List<SubDto> listOfSubDtos =  subjects.stream().map(subject-> this.subjectTosubDto(subject)).collect(Collectors.toList());
		return listOfSubDtos;
	}

//	@Override
//	public SubDto getSubById(Integer subjectId) {
//		Subject subject = this.subRepo.findById(subjectId).orElseThrow(()-> new ResourceNotFoundExceptions("subject", "id", subjectId));
//		return this.subjectTosubDto(subject);
//	}
	@Override
	public Optional<Subject> getSubjectByName(String name){
		return subRepo.findByName(name);
	}

//	 ------------------------------------------------------------
	
	SubDto subjectTosubDto(Subject subject) {
		SubDto subDto = this.modelMapper.map(subject, SubDto.class);
		return subDto;
	}
	
	Subject DtoTosubject(SubDto subDto) {
		Subject subject = this.modelMapper.map(subDto, Subject.class);
		return subject;
	}
	
	 
	
	
}
