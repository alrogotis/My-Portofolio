package gr.aueb.cf.teachersapp.service;

import java.util.List;

import gr.aueb.cf.teachersapp.dto.StudentDTO;
import gr.aueb.cf.teachersapp.model.Student;
import gr.aueb.cf.teachersapp.service.exceptions.EntityNotFoundException;

public interface IStudentService {
	
	/**
	 * Inserts a {@link Student} based on the data carried by the {@link StudentDTO}
	 * 
	 * @param studentDTO
	 * 			DTO object that contains the data
	 */
	void insertStudent(StudentDTO studentDTO);
	
	/**
	 * 
	 * Removes a {@link Student} based on the data carried by the {@link StudentDTO}
	 * 
	 * @param studentDTO
	 * 			DTO object that contains the data (mainly the id)
	 * 
	 * @throws EntityNotFoundException
	 * 			if no Student was found to delete
	 */
	void deleteStudent(StudentDTO studentDTO) throws EntityNotFoundException;
	
	/**
	 * 
	 * Updates a {@link Student} based on the data carried by the {@link StudentDTO}
	 * 
	 * @param studentDTO
	 * 			DTO object that contains the data to update based on the id
	 * 
	 * @throws EntityNotFoundException
	 * 			if no Student was found to update
	 */
	void updateStudent(StudentDTO studentDTO) throws EntityNotFoundException;
	
	/**
	 * Gets back to the caller a list of {@link Student} objects identified
	 * by the lastname's initial characters
	 * 
	 * @param lastname
	 * 		a string object that contains the lastname's initial characters
	 *  
	 * @return
	 * 		a list of {@link Student} objects
	 * 
	 * @throws EntityNotFoundException
	 * 		if no Student was found
	 */
	List<Student> getStudentsByLastname(String lastname) throws EntityNotFoundException;

}
