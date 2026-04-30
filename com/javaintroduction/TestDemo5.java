package com.javaintroduction;

public class TestDemo5 {
	//static declaration
	static int objcount=0;
	 {
		objcount++;
		
		
	}


	public static void main(String[] args) {
		System.out.println("count no of objects");
		TestDemo5 A = new TestDemo5();
		TestDemo5 B = new TestDemo5();
		TestDemo5 C = new TestDemo5();
		System.out.println(A.objcount);
		
	
		
		
		
	

	}

}
