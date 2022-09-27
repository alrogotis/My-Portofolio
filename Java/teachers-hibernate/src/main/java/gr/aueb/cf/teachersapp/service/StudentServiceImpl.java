package gr.aueb.cf.teachersapp.service;

import java.util.List;

import gr.aueb.cf.teachersapp.dao.IStudentDAO;
import gr.aueb.cf.teachersapp.dto.StudentDTO;
import gr.aueb.cf.teachersapp.model.Student;
import gr.aueb.cf.teachersapp.service.exceptions.EntityNotFoundException;
import gr.aueb.cf.teachersapp.service.util.JPAHelper;

public class StudentServiceImpl implements IStudentService{
	
	private final IStudentDAO studentDAO;
	
	public StudentServiceImpl(IStudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}

	@Override
	public void insertStudent(StudentDTO studentDTO) {
		Student student;
		
		try {
			JPAHelper.beginTransaction();
			
			student = new Student();
			student.setLastname(studentDTO.getLastname());
			student.setFirstname(studentDTO.getFirstname());
			
			if (studentDTO.getId()==null) {
				studentDAO.insert(student);
			}else {
				
			}
			JPAHelper.commitTransaction();
		}catch (Exception e){
			JPAHelper.rollbackTransaction();
			throw e;
		}finally {
			JPAHelper.closeEntityManager();
		}
		
	}

	@Override
	public void deleteStudent(StudentDTO studentDTO) throws EntityNotFoundException {
		Student studentToDelete;
		
		try {
			JPAHelper.beginTransaction();
			
			studentToDelete = new Student();
			studentToDelete.setId(studentDTO.getId());
			
			if (studentDAO.getStudentById(studentToDelete.getId()) == null) {
				throw new EntityNotFoundException(Student.class, studentToDelete.getId());
			}
			
			studentDAO.delete(studentToDelete);
			
			JPAHelper.commitTransaction();
		} catch (Exception e) {
			JPAHelper.rollbackTransaction();
			throw e;
		} finally {
			JPAHelper.closeEntityManager();
		}
	}

	@Override
	public void updateStudent(StudentDTO studentDTO) throws EntityNotFoundException {
		Student studentToUpdate;
		
		try {
			JPAHelper.beginTransaction();
			
			studentToUpdate = new Student();
			studentToUpdate.setId(studentDTO.getId());
			studentToUpdate.setLastname(studentDTO.getLastname());
			studentToUpdate.setFirstname(studentDTO.getFirstname());
			
			if (studentDAO.getStudentById(studentToUpdate.getId()) == null) {
				throw new EntityNotFoundException(Student.class, studentToUpdate.getId());
			}
			
			studentDAO.update(studentToUpdate);
			
			JPAHelper.commitTransaction();
		} catch (Exception e) {
			JPAHelper.rollbackTransaction();
			throw e;
		} finally {
			JPAHelper.closeEntityManager();
		}
		
	}

	@Override
	public List<Student> getStudentsByLastname(String lastname) throws EntityNotFoundException {
		List<Student> students = null;
		
		try {
			JPAHelper.beginTransaction();
			
			students = studentDAO.getStudentsByLastname(lastname);
			if (students.size() == 0) throw new EntityNotFoundException(Student.class, 0L);
//			if (students.isEmpty()) throw new EntityNotFoundException(Student.class, 0L);
			JPAHelper.commitTransaction();
		} catch (Exception e) {
			JPAHelper.rollbackTransaction();
			throw e;
		} finally {
			JPAHelper.closeEntityManager();
		}
		
		return students;
	}
	
	

}
