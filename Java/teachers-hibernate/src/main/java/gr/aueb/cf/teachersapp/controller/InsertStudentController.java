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

@WebServlet("/insertStudent")
public class InsertStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	IStudentDAO studentDAO = new StudentDAOImpl();
	IStudentService studentServ = new StudentServiceImpl(studentDAO);
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset=UTF-8");
		
		// Get the data
		String firstname = request.getParameter("firstname").trim();
		String lastname = request.getParameter("lastname").trim();
		
		// Construct DTO
		StudentDTO studentDTO = new StudentDTO();
		studentDTO.setFirstname(firstname);
		studentDTO.setLastname(lastname);
		
		studentServ.insertStudent(studentDTO);
		
		request.setAttribute("insertedstudent", studentDTO);
		request.getRequestDispatcher("/jsps/studentinserted.jsp").forward(request,  response);	
	}


}
