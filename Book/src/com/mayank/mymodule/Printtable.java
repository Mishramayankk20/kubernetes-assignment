package com.mayank.mymodule;

import java.sql.*;
public class Printtable {
	public void print() {
		try {
			Conn c1 = new Conn();
			ResultSet rs = c1.st.executeQuery("select * from mayank.book");
			ResultSetMetaData rsmd = rs.getMetaData();
			int col = rsmd.getColumnCount();
			for(int i=1;i<=col;i++) {
				//print column label
				System.out.print(rsmd.getColumnLabel(i)+"\t\t");
			}
//			System.out.println();
//			for(int i=1;i<=col;i++) {
//				System.out.print(rsmd.getColumnTypeName(i)+"\t\t");
//				
//			}
			
			System.out.println();
			while(rs.next()) {
				for(int i=1;i<=col;i++) {
					System.out.print(rs.getString(i)+"\t\t");
					
				}
				System.out.println();
			}
			
		}
		catch(SQLException e1) {
			System.out.println(e1);
		}
		catch(Exception e1) {
			System.out.println(e1);
		}
		
	}
}
