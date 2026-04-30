package com.javaintroduction;

public class TestDemo4 {
	//static declaration
	static int org_id=123;
	static String org_name="vcube";
	//instance declaration
	int eid;
	String ename;
	
	void main() {
		System.out.println("no.of identifiers");
	}
	public static void main(String[] args) {
		TestDemo4 cherry =new TestDemo4();
		cherry.eid=123;
		cherry.ename = "charishma";
		System.out.println("********obj1info*********");
		System.out.println("organisation id"+ org_id);
		System.out.println("organisation name"+org_name);
		System.out.println("employee id"+ cherry.eid);
		System.out.println("employee name"+cherry.ename);
		System.out.println("********obj2*********");
		TestDemo4 bindu =new TestDemo4();
		System.out.println("organisation id"+ org_id);
		System.out.println("organisation name"+ org_name);
		System.out.println("employee id"+ bindu.eid);
		System.out.println("employee name"+ bindu.ename);
		
}


}
