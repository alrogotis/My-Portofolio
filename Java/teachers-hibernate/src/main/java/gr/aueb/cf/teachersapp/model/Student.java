package gr.aueb.cf.teachersapp.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="STUDENTS")
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID")
	private Long id;
	
	@Column(name="FIRSTNAME", length=512, nullable=false)
	private String firstname;
	
	@Column(name="LASTNAME", length=512, nullable=false)
	private String lastname;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="TEACHER_ID")
	private Teacher teacher;
	
	public Student() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	protected void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	
	
	
	

}
