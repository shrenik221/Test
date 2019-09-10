package com.evry.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.evry.dao.DaoInterface;
import com.evry.entity.Student;

@Component
public class DaoService {

	@Autowired 
	DaoInterface repository;
	
	public void add(Student student) {
		repository.save(student);
	}
	
	   /*public void delete(long id) {
	        repository.deleteAll();
	    }
	    public List<Student> getDogs() {
	        return (List<Student>) repository.findAll();
	    }*/
}
