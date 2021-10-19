package com.mayank.mymodule;
import java.util.*;
import java.sql.*;

public class Book {
	private int id ;
	private String name ;
	private String edition;
	//static Connection con=null;
//	static PreparedStatement pst;
	//ResultSet rs;
	static int i=0;
	

	public Book(int id, String name, String edition) {
		//connect();
		this.id = id;
		this.name = name;
		this.edition = edition;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEdition() {
		return edition;
	}
	
	public void setEdition(String edition) {
		this.edition = edition;
	}
}
//	public static void display(Book b) {
//		int a = b.getId();
//		String s = b.getName();
//		String s1 = b.getEdition();
//		System.out.println(a+"    "+s+"    "+s1);
//	}
	
	
//	public static void main(String args[]) {
//	
//		Book b[] = new Book[20];
//		b[0] = new Book(1,"Rd sharma","first");
//		b[1] = new Book(2,"Mathematics","first");
//		b[2] = new Book(3,"Biology","second");
//		b[3] = new Book(4,"Chemistry","first");
//		b[4] = new Book(5,"Physics","second");
//		b[5] = new Book(6,"English","first");
//		b[6] = new Book(7,"ED","first");
//		b[7] = new Book(8,"M-1","first");
//		b[8] = new Book(9,"A.I","second");
//		b[9] = new Book(10,"Ml","first");
//		b[10] = new Book(11,"Docker","second");
//		b[11] = new Book(12,"linux","first");
//		b[12] = new Book(13,"java","second");
//		b[13] = new Book(14,"c","first");
//		b[14] = new Book(15,"c++","second");
//		b[15] = new Book(16,"kubernetes","first");
//		b[16] = new Book(17,"O.S","first");
//		b[17] = new Book(18,"Hindi","first");
//		b[18] = new Book(19,"History","second");
//		b[19] = new Book(20,"cloud computing","first");	
//		add(b[1]);
//		}
//}

//public void connect() {
//try {
//	Class.forName("com.mysql.cj.jdbc.Driver");
//	 con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","");
//}
//catch(Exception e) {
//	System.out.println(e); 
//}
//}
