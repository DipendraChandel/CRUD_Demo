package com.example.studentdb.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.studentdb.bean.Subject;
import com.example.studentdb.repository.SubjectRepository;

@Service
public class SubjectService {
	
	@Autowired
	public SubjectRepository subjectRepo;
	
	public List<Subject> getAllsubjects(){
		List<Subject> subjects = new ArrayList<>();
		subjectRepo.findAll().forEach(subjects::add);
		return subjects;
	}

	public void addSubject(Subject subject) {
		subjectRepo.save(subject);
	}

	/*
	 * using .save() in both add & update because if the subject 
	 * is not present it will create a fresh subject
	 */
	public void updateSubject(String id, Subject subject) {
		subjectRepo.save(subject);
		
	}

	public void deleteSubject(String id) {
		subjectRepo.deleteById(id);
	}
	
	
}
