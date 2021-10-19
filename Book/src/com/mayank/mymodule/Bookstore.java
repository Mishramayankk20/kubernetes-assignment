package com.mayank.mymodule;

public class Bookstore {
		public static void main(String args[]) {
			Manipulate m = new Manipulate();
			Printtable p = new Printtable();
			Book b[] = new Book[20];
			b[0] = new Book(1,"Rd sharma","first");
			b[1] = new Book(2,"Mathematics","first");
			b[2] = new Book(3,"Biology","second");
			b[3] = new Book(4,"Chemistry","first");
			b[4] = new Book(5,"Physics","second");
			b[5] = new Book(6,"English","first");
			b[6] = new Book(7,"ED","first");
			b[7] = new Book(8,"M-1","first");
			b[8] = new Book(9,"A.I","second");
			b[9] = new Book(10,"Ml","first");
			b[10] = new Book(11,"Docker","second");
			b[11] = new Book(12,"linux","first");
			b[12] = new Book(13,"java","second");
			b[13] = new Book(14,"c","first");
			b[14] = new Book(15,"c++","second");
			b[15] = new Book(16,"kubernetes","first");
			b[16] = new Book(17,"O.S","first");
			b[17] = new Book(18,"Hindi","first");
			b[18] = new Book(19,"History","second");
			b[19] = new Book(20,"cloud computing","first");	
			m.create();
			m.table();
			m.truncate();
			for(int i=0;i<20;i++) {
				try {
					m.add(b[i]);
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}	
			}
			
			
			for(int i=1;i<=20;i++) {
				try {
					m.remove(i);
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				i=i+6;
			}
			m.update(3,"s.chand","first");
			m.update(6, "comic", "first");
			m.update(11,"spring boot","second");
			p.print();
		}
}
