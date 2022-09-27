package gr.aueb.cf.teachersapp.dao;

import java.util.List;

import gr.aueb.cf.teachersapp.model.Student;

public interface IStudentDAO {
	
	void insert(Student student);
	void delete(Student student);
	void update(Student student);
	List<Student> getStudentsByLastname(String lastname);
	Student getStudentById(Long id);

}
