package com.mayank.mymodule;

import java.sql.*;

public class Conn {
	public Connection con;
	Statement st;
	public Conn() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con = DriverManager.getConnection("jdbc:mysql://mysql:3306","root","password");
			 st = con.createStatement();
		}
		catch(Exception e) {
			System.out.println(e); 
		}
	}


}
