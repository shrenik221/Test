package com.evry.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.evry.entity.Student;
@Repository
public interface DaoInterface extends CrudRepository<Student, Long> {

}
