package gr.aueb.cf.teachersapp.dto;

public class TeacherDTO {

	private Long id;
	private String lastname;
	private String firstname;
	
	public TeacherDTO() {}

	public Long getId() {
		return id;
	}

	public TeacherDTO(Long id, String lastname, String firstname) {
		super();
		this.id = id;
		this.lastname = lastname;
		this.firstname = firstname;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
}
