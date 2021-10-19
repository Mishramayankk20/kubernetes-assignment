package com.mayank.mymodule;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Manipulate {
	//static int i=0;
	public void create() {
		try {
			Conn c1 = new Conn();
			String q = "create database mayank";
			c1.st.executeQuery(q);
			
		}
		catch(SQLException e1) {
			System.out.println(e1);
		}
		catch(Exception e1) {
			System.out.println(e1);
		}
	}
	public void table() {
		try {
			Conn c1 = new Conn();
			String q = "create table Book (id int primary key, name varchar(225),edition  varchar(225));";
			c1.st.executeQuery(q);
		}
		catch(SQLException e1) {
			System.out.println(e1);
		}
		catch(Exception e1) {
			System.out.println(e1);
		}
	}
	public void truncate() {
		try {
			Conn c1 = new Conn();
			String q = "truncate table mayank.book";
			c1.st.executeUpdate(q);
			//System.out.println("All data deleted");
		}
		catch(SQLException e1) {
			System.out.println(e1);
		}
		catch(Exception e1) {
			System.out.println(e1);
		}
		
	}
	public void add(Book b) {
		int n = b.getId();
		String id = Integer.toString(n);
		String s = b.getName();
		String name = s.toLowerCase();		
		String edition = b.getEdition();
			if(check(n)) {
			try {
				Conn c1 = new Conn();
				
				//String q = "insert into mayank.book where id = '"+id+"' and name = '"+name+"' and edition = '"+edition+"'";
				String q = "insert into mayank.book value('"+id+"','"+name+"' ,'"+edition+"')";
//				pst = con.prepareStatement("insert into mayank.book(id,name,edition) values(?,?,?)");
//				pst.setString(1,id);
//				pst.setString(2,name);
//				pst.setString(3,edition);
//				pst.executeUpdate();
				c1.st.executeUpdate(q);
				System.out.println("Record inserted");
			}
			catch(SQLException e1) {
				System.out.println(e1);
			}
			catch(Exception e1) {
				System.out.println(e1);
			}
			}
			else 
				System.out.println("Failure -----------ID already exist");
		
	}
	public  void remove(int n) {
		//System.out.println(i);
		String id = Integer.toString(n);
		//i--;
		//System.out.println(check(n));
		if(!check(n)) {
		try {
			Conn c1 = new Conn();
			//pst = con.prepareStatement("delete from mayank.book where id=?");
			String  q = "delete from mayank.book where id = '"+id+"'";
			//st.setString(1,id);
			c1.st.executeUpdate(q);
			System.out.println("Record Deleted with id = "+id);
		}
		catch(SQLException e1) {
			System.out.println(e1);
		}
		catch(Exception e1) {
			System.out.println(e1);
		}
		}
		else 
			System.out.println("FAILURE!!--ID NOT EXIST");
		//System.out.println("removed");
		//System.out.println(i);
		
	}
	public boolean check(int n) {
		int id = n;
		boolean flag = false;
		try {
			Conn c1 = new Conn();
			String q = "select * from mayank.book where id = '"+id+"'";
			ResultSet rs = c1.st.executeQuery(q);
			if(rs.next())
				flag = false;
			else
				flag = true;
		}
		catch(SQLException e1) {
			System.out.println(e1);
		}
		catch(Exception e1) {
			System.out.println(e1);
		}
		
		return flag;
		
	}
	public  void update(int n1 ,String n2,String n3) {
		
		String id,name,edition;
		id = Integer.toString(n1);
		name = n2;
		edition = n3;
		//System.out.println(check(n1));
			if(!check(n1)) {
				try {
					Conn c1 = new Conn();
					String q = "update mayank.book set name = '"+name+"' where id= '"+id+"'";
					// "select * from login where cardno = '"+cardno+"' and pin = '"+pin+"'";
//					pst = con.prepareStatement("update mayank.book set name=? where id=? ");
//					pst.setString(1,name);
//					pst.setString(2,id);
//					pst.executeUpdate();
					c1.st.executeUpdate(q);
					//System.out.println("Record updated");
				}
				catch(SQLException e1) {
					System.out.println(e1);
				}
				catch(Exception e1) {
					System.out.println(e1);
				}
				System.out.println("SUCCESS-----RECORD UPDATED");
			}
			else
				System.out.println("FAILURE!! -> RECORD NOT FOUND ID---INVALID");
		//}
//		//else {
//			id = Integer.toString(i);
//			name = "updatedbook";
//			edition = "latest";
		///}
		
	}
}

