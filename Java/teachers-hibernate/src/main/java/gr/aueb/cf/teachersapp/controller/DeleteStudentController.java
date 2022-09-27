package gr.aueb.cf.teachersapp.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import gr.aueb.cf.teachersapp.dao.IStudentDAO;
import gr.aueb.cf.teachersapp.dao.StudentDAOImpl;
import gr.aueb.cf.teachersapp.dto.StudentDTO;
import gr.aueb.cf.teachersapp.service.IStudentService;
import gr.aueb.cf.teachersapp.service.StudentServiceImpl;
import gr.aueb.cf.teachersapp.service.exceptions.EntityNotFoundException;

@WebServlet("/deleteStudent")
public class DeleteStudentController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	IStudentDAO studentDAO = new StudentDAOImpl();
	IStudentService studentServ = new StudentServiceImpl(studentDAO);
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");

		Long id = Long.parseLong(request.getParameter("id"));
		String firstname = request.getParameter("fname");
		String lastname = request.getParameter("sname");
		
		StudentDTO studentDTO = new StudentDTO();
		studentDTO.setId(id);
		studentDTO.setFirstname(firstname);
		studentDTO.setLastname(lastname);
	
		try {
			studentServ.deleteStudent(studentDTO);
			request.setAttribute("student", studentDTO);
			request.getRequestDispatcher("/jsps/studentdeleted.jsp").forward(request, response);
		} catch (EntityNotFoundException e) {
			request.setAttribute("deleteAPIError", true);
			request.getRequestDispatcher("/jsps/students.jsp").forward(request, response);	
		}	
	}

	

}
