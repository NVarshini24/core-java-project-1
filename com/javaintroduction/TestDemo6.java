package com.javaintroduction;

public class TestDemo6 {
	static void main1() {
		System.out.println("static method called");
		TestDemo6 A=new TestDemo6();
		A.main();
		A.main2();
	}
	void main() {
		System.out.println("instance method 1 called");
		
	}
	void main2() {
		System.out.println("instance method 2 called");
	}
	static {
		main1();
	}

	public static void main(String[] args) {
		System.out.println("main method");
		
	

	}

}
