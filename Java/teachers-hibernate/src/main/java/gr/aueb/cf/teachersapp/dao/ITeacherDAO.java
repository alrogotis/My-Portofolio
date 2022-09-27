package gr.aueb.cf.teachersapp.dao;

import java.util.List;

import gr.aueb.cf.teachersapp.model.Teacher;

public interface ITeacherDAO {
	void insert(Teacher teacher);
	void delete(Teacher teacher);
	void update(Teacher teacher);
	List<Teacher> getTeachersByLastname(String lastname);
	Teacher getTeacherById(Long id);
}
