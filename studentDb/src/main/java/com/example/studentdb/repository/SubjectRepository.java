package com.example.studentdb.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.studentdb.bean.Subject;

public interface SubjectRepository extends CrudRepository<Subject, String>{
	
}
