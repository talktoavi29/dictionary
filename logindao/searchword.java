package com.logindao;

import java.io.PrintWriter;
import java.sql.*;
public class searchword {
	String sql  = "select * from entries where word = ?";
	String url = "jdbc:mysql://localhost:3306/dict";
	String username = "root";
	String password = "thinkbuddha";
	
	public String wordhunt(String word) throws ClassNotFoundException, SQLException{
		String def = "";	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url, username, password);
			PreparedStatement st = conn.prepareStatement(sql);
			st.setString(1, word);
			ResultSet rs = st.executeQuery();
			if(rs.next()) {
			def = rs.getString(3);
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return def;
	}
}
