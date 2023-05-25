package practice_collections;

import java.util.LinkedList;

public class Print_Name_Email {
	
	public void display() {
	
	LinkedList<String> StudentName = new LinkedList<String>();
	StudentName.add("Adithya");
	StudentName.add("Barani");
	StudentName.add("Pratima");
	StudentName.add("Srini");
	StudentName.add("Viswa");
	
	LinkedList<String> mailid = new LinkedList<String>();
	mailid.add("adithya.thiruvoth@gmail.com");
	mailid.add("barani.selvam78@gmail.com");
	mailid.add("pratimasadalagee@gmail.com");
	mailid.add("sriniv523@gmail.com");
	mailid.add("dviswanath00@gmail.com");
	
	     int i = 0;
		int o = 1;
		int p = 2;
		int q = 3;
		int r = 4;
		System.out.println(StudentName.get(i) + " :  " +  mailid.get(i));
		System.out.println(StudentName.get(o) + " :  " +  mailid.get(o));
		System.out.println(StudentName.get(p) + " :  " +  mailid.get(p));
		System.out.println(StudentName.get(q) + " :  " +  mailid.get(q));
		System.out.println(StudentName.get(r) + " :  " +  mailid.get(r));
	}	
	public static void main(String[] args) {
		
		Print_Name_Email PNM = new Print_Name_Email();
		
		PNM.display();
	}

}
