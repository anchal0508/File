package com.complete.complete_project.services;

import java.util.List;
import java.util.Optional;

import com.complete.complete_project.entity.Subject;
import com.complete.complete_project.payloads.SubDto;

public interface SubService {
	SubDto createSub(SubDto subDto);
//	void deleteSub(Integer subjectId);
//	SubDto updateSub(SubDto subDto, Integer subjectId);
	List<SubDto> getAllSub();
//	SubDto getSubById(Integer subjectId);
	Optional<Subject> getSubjectByName(String name);
}
