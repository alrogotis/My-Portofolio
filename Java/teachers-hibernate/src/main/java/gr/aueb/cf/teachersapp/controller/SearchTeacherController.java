package gr.aueb.cf.teachersapp.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import gr.aueb.cf.teachersapp.dao.ITeacherDAO;
import gr.aueb.cf.teachersapp.dao.TeacherDAOImpl;
import gr.aueb.cf.teachersapp.dto.TeacherDTO;
import gr.aueb.cf.teachersapp.model.Teacher;
import gr.aueb.cf.teachersapp.service.ITeacherService;
import gr.aueb.cf.teachersapp.service.TeacherServiceImpl;
import gr.aueb.cf.teachersapp.service.exceptions.EntityNotFoundException;

@WebServlet("/search")
public class SearchTeacherController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	ITeacherDAO teacherDAO = new TeacherDAOImpl();
	ITeacherService teacherServ = new TeacherServiceImpl(teacherDAO);
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		
		String lastname = request.getParameter("lastname");
		List<Teacher> teachers = new ArrayList<>();
		
		TeacherDTO teacherDTO = new TeacherDTO();
		teacherDTO.setLastname(lastname);
		
		try {
			teachers = teacherServ.getTeachersByLastname(lastname);
			request.setAttribute("teachers", teachers);
			request.getRequestDispatcher("/jsps/teachers.jsp").forward(request, response);
		} catch (EntityNotFoundException e) {
			e.printStackTrace();
			request.setAttribute("teachersNotFound", true);
			request.getRequestDispatcher("/jsps/teachersmenu.jsp").forward(request, response);
		}	
	}
}
