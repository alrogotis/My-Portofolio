package gr.aueb.cf.teachersapp.service;

import java.util.List;

import gr.aueb.cf.teachersapp.dto.TeacherDTO;
import gr.aueb.cf.teachersapp.model.Teacher;
import gr.aueb.cf.teachersapp.service.exceptions.EntityNotFoundException;

public interface ITeacherService {
	
	/**
	 * Inserts a {@link Teacher} based on the data carried by the {@link TeacherDTO}
	 * 
	 * @param teacherDTO
	 * 			DTO object that contains the data
	 */
	void insertTeacher(TeacherDTO teacherDTO);
	
	/**
	 * 
	 * Removes a {@link Teacher} based on the data carried by the {@link TeacherDTO}
	 * 
	 * @param teacherDTO
	 * 			DTO object that contains the data (mainly the id)
	 * 
	 * @throws EntityNotFoundException
	 * 			if no Teacher was found to delete
	 */
	void deleteTeacher(TeacherDTO teacherDTO) throws EntityNotFoundException;
	
	/**
	 * 
	 * Updates a {@link Teacher} based on the data carried by the {@link TeacherDTO}
	 * 
	 * @param teacherDTO
	 * 			DTO object that contains the data to update based on the id
	 * 
	 * @throws EntityNotFoundException
	 * 			if no Teacher was found to update
	 */
	void updateTeacher(TeacherDTO teacherDTO) throws EntityNotFoundException;
	
	
	/**
	 * Gets back to the caller a list of {@link Teacher} objects identified
	 * by the lastname's initial characters
	 * 
	 * @param lastname
	 * 		a string object that contains the lastname's initial characters
	 *  
	 * @return
	 * 		a list of {@link Teacher} objects
	 * 
	 * @throws EntityNotFoundException
	 * 		if no Teacher was found
	 */
	List<Teacher> getTeachersByLastname(String lastname) throws EntityNotFoundException;
}
