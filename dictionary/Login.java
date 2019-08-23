package com.dictionary;

import java.io.BufferedReader;
import com.logindao.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

public class Login extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		
		String uname = req.getParameter("username");
		String pass = req.getParameter("password");
		
		logindao1 dao = new logindao1();
		try {
			if(dao.check(uname, pass)) {
				 HttpSession session = req.getSession();
				 session.setAttribute("username", uname);
				 res.sendRedirect("index.jsp");
			}
			else {res.sendRedirect("login.jsp");}}
			catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			}
	}

