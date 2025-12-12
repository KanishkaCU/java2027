package com.training.day1;
import java.util.Scanner;

public class Student{
		int rollno;
		String name;
		int mark1;
		int mark2;
		int totalmark;
		
		Student(){
			rollno=0;
			name= "no name" ;
		}
		
		Student(int rollno,String name, int mark1, int mark2){
			this.rollno=rollno;
			this.name= name ;
			mark1=mark1;
			mark2=mark2;
			this.totalmark=mark1+mark2;
		}

	void print() {
		System.out.println(rollno+"-"+name+" "+totalmark);
	}
	public static void main(String[]args) {
		Student s1 = new Student();
		Student s2 = new Student(2,"kanish",25,25);
		Student s3 = new Student(3,"CU",75,25);
		Student s4 = new Student(4,"kani",25,85);
		s1.totalmark=s1.mark1+s1.mark2;
		s1.print();
		s2.print();
		s3.print();
		s4.print();
		}
	}
