package org.basess;

public class TestingClasses2 {
     public static void main(String[] args) {
    	 
    	 TestingClasses1 t1 =TestingClasses1.singletonObject();
    	 t1.tc01();
    	 System.out.println(System.identityHashCode(t1));
    	 
    	 TestingClasses1 t2 = TestingClasses1.singletonObject();
    	 t2.tc01();
    	 System.out.println(System.identityHashCode(t2)); 
    	 
    	 TestingClasses1 t3 = TestingClasses1.singletonObject();
    	 t3.tc01();
    	 System.out.println(System.identityHashCode(t3)); 
    	 
     }
}
