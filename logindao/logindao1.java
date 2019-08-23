package com.logindao;

import java.sql.*;

import javax.servlet.annotation.WebServlet;

public class logindao1 {
	String sql  = "select * from logindata where uname = ? and pass = ?";
	String url = "jdbc:mysql://localhost:3306/dict";
	String username = "root";
	String password = "thinkbuddha";
	public boolean check(String uname, String pass) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(url, username, password);
		PreparedStatement st = conn.prepareStatement(sql);
		st.setString(1, uname);
		st.setString(2, pass);
		ResultSet rs = st.executeQuery();
		if(rs.next()) {
			return true;
		}
		return false;
	}

}
