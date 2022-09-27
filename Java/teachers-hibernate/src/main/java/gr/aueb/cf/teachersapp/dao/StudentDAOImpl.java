package gr.aueb.cf.teachersapp.dao;

import java.util.List;
import gr.aueb.cf.teachersapp.service.util.JPAHelper;
import gr.aueb.cf.teachersapp.model.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.ParameterExpression;
import jakarta.persistence.criteria.Root;

public class StudentDAOImpl implements IStudentDAO{

	/*
	 * Inserts a Student with a given parameter Student
	 */
	@Override
	public void insert(Student student) {
		EntityManager em = getEntityManager();
		em.persist(student);
	}

	/*
	 * Deletes a Student with a given parameter Student
	 */
	@Override
	public void delete(Student student) {
		EntityManager em = getEntityManager();
		Student toDelete = em.find(Student.class, student.getId());
		em.remove(toDelete);
	}

	/*
	 * Updates a Student with a given parameter Student
	 */
	@Override
	public void update(Student student) {
		getEntityManager().merge(student);
	}

	/*
	 * returns a List of Students with a given lastname .
	 */
	@Override
	public List<Student> getStudentsByLastname(String lastname) {
		// Create Criteria Builder instance
		CriteriaBuilder builder = getEntityManager().getCriteriaBuilder();
		
		//Define what is returned
		CriteriaQuery<Student> selectQuery = builder.createQuery(Student.class);
		
		//Define From clause
		Root<Student> root = selectQuery.from(Student.class);
		
		ParameterExpression<String> val = builder.parameter(String.class, "studentLastname");
		
		selectQuery.select(root).where(builder.like(root.get("lastname"), val));
		
		TypedQuery<Student> query = getEntityManager().createQuery(selectQuery).setParameter("studentLastname", lastname + "%");
		return query.getResultList();
	}

	/*
	 * returns a Student with a given id
	 */
	@Override
	public Student getStudentById(Long id) {
		return getEntityManager().find(Student.class, id);
	}
	
	private EntityManager getEntityManager() {
		return JPAHelper.getEntityManager();
	}
	

}
