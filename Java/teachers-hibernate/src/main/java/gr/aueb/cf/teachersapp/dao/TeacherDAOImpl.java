package gr.aueb.cf.teachersapp.dao;

import java.util.List;
import gr.aueb.cf.teachersapp.service.util.JPAHelper;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.ParameterExpression;
import jakarta.persistence.criteria.Root;
import gr.aueb.cf.teachersapp.model.Teacher;

public class TeacherDAOImpl implements ITeacherDAO {

	@Override
	public void insert(Teacher teacher) {
		EntityManager em = getEntityManager();
		em.persist(teacher);
	}

	@Override
	public void delete(Teacher teacher) {
		EntityManager em = getEntityManager();
		Teacher toDelete = em.find(Teacher.class, teacher.getId());
		em.remove(toDelete);
	}

	@Override
	public void update(Teacher teacher) {
		getEntityManager().merge(teacher);
	}

	@Override
	public List<Teacher> getTeachersByLastname(String surname) {
		// Create Criteria Builder instance
		CriteriaBuilder builder = getEntityManager().getCriteriaBuilder();
		
		// Define what is returned
		CriteriaQuery<Teacher> selectQuery = builder.createQuery(Teacher.class);
		
		// Define FROM clause
		Root<Teacher> root = selectQuery.from(Teacher.class);
		
		ParameterExpression<String> val = builder.parameter(String.class, "teacherLastname");
		
		selectQuery.select(root).where(builder.like(root.get("lastName"), val));
		
		TypedQuery<Teacher> query = getEntityManager().createQuery(selectQuery).setParameter("teacherLastname", surname + "%");
		return query.getResultList();
	}

	@Override
	public Teacher getTeacherById(Long id) {
		return getEntityManager().find(Teacher.class, id);
	}
	
	private EntityManager getEntityManager() {
		return JPAHelper.getEntityManager();
	}

}
