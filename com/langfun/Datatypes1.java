package com.langfun;

public class Datatypes1 {
	byte stu_age;
	short stu_rollno;
	int stu_pin;
	long stu_phnum;
	void show() {
		stu_age=12;
		 stu_rollno=98;
		 stu_pin=534320;
		 stu_phnum=7396671393l;	
		 System.out.println("the age of the student is"+stu_age);
		System.out.println("the age of the student is"+stu_rollno);
		System.out.println("the age of the student is"+stu_pin);
		System.out.println("the age of the student is"+stu_phnum);

	}

	public static void main(String[] args) {
		
		Datatypes1 d=new Datatypes1();
		d.show();
		
		
		

	}

}
