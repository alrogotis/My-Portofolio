package gr.aueb.cf.teachersapp.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		
		// get data
		String email = request.getParameter("eMail");
		String password = request.getParameter("password");
		
		// construct DTO
		
		
		// call service
		
		if ( (email.equals("a8anassis@gmail.com")) && (password.equals("123")) ) {
			// return response
			request.getRequestDispatcher("/jsps/teachersmenu.jsp").forward(request, response);
		} else if (email.equals("alex@gmail.com") && (password.equals("456")) ) {
			// return response
			request.getRequestDispatcher("/jsps/studentsmenu.jsp").forward(request, response);
		} else {
			// return response
			request.setAttribute("error", true);
			request.getRequestDispatcher("/jsps/login.jsp").forward(request, response);
		}
		
		
	}
}
