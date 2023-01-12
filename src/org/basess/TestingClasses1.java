package org.basess;

public class TestingClasses1 {

	public void tc01() {
		System.out.println("Testing");
	}
	//To Restrict the object Creation
	//To create One Constructor ///private
	private TestingClasses1() {
		
	}
	//To Create Static Variable
	public static TestingClasses1 obj;
	
	//To create Static method
	public static TestingClasses1 singletonObject() {
		if (obj == null) {
			obj = new TestingClasses1();
		}
		return obj;
	}
}
