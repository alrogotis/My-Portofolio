package gr.aueb.cf.teachersapp.service;

import java.util.List;

import gr.aueb.cf.teachersapp.dao.ITeacherDAO;
import gr.aueb.cf.teachersapp.dto.TeacherDTO;
import gr.aueb.cf.teachersapp.model.Teacher;
import gr.aueb.cf.teachersapp.service.exceptions.EntityNotFoundException;
import gr.aueb.cf.teachersapp.service.util.JPAHelper;

public class TeacherServiceImpl implements ITeacherService {
	
	private final ITeacherDAO teacherDAO;
	
	public TeacherServiceImpl(ITeacherDAO teacherDAO) {
		this.teacherDAO = teacherDAO;
	}

	@Override
	public void insertTeacher(TeacherDTO teacherDTO) {
		Teacher teacher;
		
		try {
			JPAHelper.beginTransaction();
			
			teacher = new Teacher();
			teacher.setLastName(teacherDTO.getLastname());
			teacher.setFirstName(teacherDTO.getFirstname());
			
			if (teacherDTO.getId() == null) {
				teacherDAO.insert(teacher);
			} else {
				// option to update
			}
			JPAHelper.commitTransaction();
		} catch (Exception e) {
			JPAHelper.rollbackTransaction();
			throw e;
		} finally {
			JPAHelper.closeEntityManager();
		}
	}

	@Override
	public void deleteTeacher(TeacherDTO teacherDTO) throws EntityNotFoundException {
		Teacher teacherToDelete;
		
		try {
			JPAHelper.beginTransaction();
			
			teacherToDelete = new Teacher();
			teacherToDelete.setId(teacherDTO.getId());
			
			if (teacherDAO.getTeacherById(teacherToDelete.getId()) == null) {
				throw new EntityNotFoundException(Teacher.class, teacherToDelete.getId());
			}
			
			teacherDAO.delete(teacherToDelete);
			
			JPAHelper.commitTransaction();
		} catch (Exception e) {
			JPAHelper.rollbackTransaction();
			throw e;
		} finally {
			JPAHelper.closeEntityManager();
		}
	}

	@Override
	public void updateTeacher(TeacherDTO teacherDTO) throws EntityNotFoundException {
		Teacher teacherToUpdate;
		
		try {
			JPAHelper.beginTransaction();
			
			teacherToUpdate = new Teacher();
			teacherToUpdate.setId(teacherDTO.getId());
			teacherToUpdate.setLastName(teacherDTO.getLastname());
			teacherToUpdate.setFirstName(teacherDTO.getFirstname());
			
			if (teacherDAO.getTeacherById(teacherToUpdate.getId()) == null) {
				throw new EntityNotFoundException(Teacher.class, teacherToUpdate.getId());
			}
			
			teacherDAO.update(teacherToUpdate);
			
			JPAHelper.commitTransaction();
		} catch (Exception e) {
			JPAHelper.rollbackTransaction();
			throw e;
		} finally {
			JPAHelper.closeEntityManager();
		}
	}

	@Override
	public List<Teacher> getTeachersByLastname(String lastname) throws EntityNotFoundException {
		List<Teacher> teachers = null;
		
		try {
			JPAHelper.beginTransaction();
			
			teachers = teacherDAO.getTeachersByLastname(lastname);
			if (teachers.size() == 0) throw new EntityNotFoundException(Teacher.class, 0L);
//			if (teachers.isEmpty()) throw new EntityNotFoundException(Teacher.class, 0L);
			JPAHelper.commitTransaction();
		} catch (Exception e) {
			JPAHelper.rollbackTransaction();
			throw e;
		} finally {
			JPAHelper.closeEntityManager();
		}
		
		return teachers;
	}
}
