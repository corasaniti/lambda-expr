package com.corasaniti.lambda;

/*
 * 	Lamda Expression Syntax
 *  () -> expression;
 *  () -> {body}
 *  
 *  (parameters) -> expression;
 *  (parameters) -> {body}
 *  
 *  Example
 *  (int x, int y)	->	x + y;
 *  () -> System.out.println("Hello world with Lambda!");
 *  (String s) -> { System.out.println(s); }
 *  (int a, int b, String message) -> { System.out.println("Sum " + a+b); System.out.println(message); }
 */


public class RunnableTest {
	public static void main(String[] args) {
		 
	     System.out.println("=== RunnableTest ===");
	 
	    // Anonymous Runnable
	    Runnable r1 = new Runnable(){
	 
	      @Override
	      public void run(){
	        System.out.println("Hello world old style!");
	      }
	    };
	 
	   // Lambda Runnable Example
	   Runnable r2 = () -> System.out.println("Hello world with Lambda!");
	 
	   r1.run();
	   r2.run();   
	 }
}
