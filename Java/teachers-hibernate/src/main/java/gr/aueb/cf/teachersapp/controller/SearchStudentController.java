package gr.aueb.cf.teachersapp.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import gr.aueb.cf.teachersapp.dao.IStudentDAO;
import gr.aueb.cf.teachersapp.dao.StudentDAOImpl;
import gr.aueb.cf.teachersapp.dto.StudentDTO;
import gr.aueb.cf.teachersapp.model.Student;
import gr.aueb.cf.teachersapp.service.IStudentService;
import gr.aueb.cf.teachersapp.service.StudentServiceImpl;
import gr.aueb.cf.teachersapp.service.exceptions.EntityNotFoundException;

@WebServlet("/searchStudent")
public class SearchStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	IStudentDAO studentDAO = new StudentDAOImpl();
	IStudentService studentServ = new StudentServiceImpl(studentDAO);
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html; charset=UTF-8");
		
		String lastname = request.getParameter("lastname");
		List<Student> students = new ArrayList<>();
		
		StudentDTO studentDTO = new StudentDTO();
		studentDTO.setLastname(lastname);
		
		try {
			students = studentServ.getStudentsByLastname(lastname);
			request.setAttribute("students", students);
			request.getRequestDispatcher("/jsps/students.jsp").forward(request, response);
		} catch (EntityNotFoundException e) {
			e.printStackTrace();
			request.setAttribute("studentsNotFound", true);
			request.getRequestDispatcher("/jsps/studentsmenu.jsp").forward(request, response);
		}	
	}


}
