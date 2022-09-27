package gr.aueb.cf.teachersapp.rest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import gr.aueb.cf.teachersapp.dao.IStudentDAO;
import gr.aueb.cf.teachersapp.dao.StudentDAOImpl;
import gr.aueb.cf.teachersapp.model.Student;
import gr.aueb.cf.teachersapp.service.IStudentService;
import gr.aueb.cf.teachersapp.service.StudentServiceImpl;
import gr.aueb.cf.teachersapp.service.exceptions.EntityNotFoundException;

@WebServlet("/students")
public class StudentRestController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	IStudentDAO studentDAO = new StudentDAOImpl();
	IStudentService studentServ = new StudentServiceImpl(studentDAO);
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setHeader("Content-Type", "application/json; charset=UTF-8");
		
		String lastname = request.getParameter("lastname").trim();
		
		List<Student> students = new ArrayList<>();
		String jsonString;
		Gson gson = new Gson();
		
		try {
			students = studentServ.getStudentsByLastname(lastname);
			jsonString = gson.toJson(students);
			response.getWriter().write(jsonString);
		} catch (EntityNotFoundException e) {
			e.printStackTrace();
			response.getWriter().write("{}");
		}
	}

}
