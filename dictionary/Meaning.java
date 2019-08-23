package com.dictionary;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.http.*;

import com.logindao.searchword;

public class Meaning extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		String word = req.getParameter("word");
		String meaning = "";
		PrintWriter out = res.getWriter();
		searchword sw = new searchword();
		try {
			meaning = sw.wordhunt(word);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		out.println(meaning);
	}
	
}
