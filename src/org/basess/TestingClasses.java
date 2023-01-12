package org.basess;

public class TestingClasses {

	public TestingClasses() {
		System.out.println("Default");
	 }
	
	public TestingClasses(String name) {
		System.out.println("paramterized Cons"+name);
	}
	
	public static void main(String[] args) {
		TestingClasses t =new TestingClasses();
		TestingClasses t1 = new TestingClasses("kavina");
	}
}
