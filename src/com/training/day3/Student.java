package com.training.day3;

import java.util.Scanner;

//public class Student {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		char ch=sc.next().charAt(0); 
//		System.out.println(ch);
//		
//	}
//
//}
public class Student{
	int rollno;
	String name;
	float CGPA;
	char sec;
	boolean hostel;
	
	Student(int r, String name, float CGPA, char sec, boolean hstl){
		rollno = r;
		this.name = name;
		this.CGPA = CGPA;
		this.sec = sec;
		hostel = hstl;
	}
	 
	void print() {
		System.out.println(rollno + " "+name+" "+sec+" "+CGPA+" "+hostel+" ");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		String name = sc.next();
		float CGPA = sc.nextFloat();
		char sec = sc.next().charAt(0);
		boolean hstl = sc.nextBoolean();
		
		Student s1 = new Student(r, name, CGPA, sec, hstl);
		s1.print();
	}
	
	
	
}
