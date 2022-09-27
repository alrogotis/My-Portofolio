package gr.aueb.cf.teachersapp.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="TEACHERS")
public class Teacher {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID")
	private Long id;
	
	@Column(name="FIRSTNAME", length=512, nullable=false)
	private String firstName;
	
	@Column(name="LASTNAME", nullable=false)
	private String lastName;
	
	@OneToMany(mappedBy="teacher")
	private List<Student> students =  new ArrayList<>();
	
	public Teacher() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	protected List<Student> getStudents() {
		return students;
	}
	
	public List<Student> getAllStudents() {
		return Collections.unmodifiableList(this.students);
	}

	protected void setStudents(List<Student> students) {
		this.students = students;
	}
	
	public boolean addStufent(Student student) {
		if (student == null) {
			return false;
		}
		
		if (Objects.deepEquals(student.getTeacher(), this)) {
			throw new IllegalStateException("Student isalready assignes to Teacher");
		}
		
		student.setTeacher(this);
		this.students.add(student);
		return true;
	
	}
	
	

	
}
