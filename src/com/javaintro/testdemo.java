package com.javaintro;

public class testdemo {
	
	static void introduct1(){
		introduct2();
		System.out.println("method1 called");
	}
	static void introduct2() {
		System.out.println("method2 called");
	}
	static void introduct3() {
		System.out.println("method3 called");
	}
	static void introduct4() {
		introduct2();
		System.out.println("method4 called");
	}
	static void introduct5() {
		testdemo t=new testdemo();
		t.method4();
		System.out.println("method5 called");
	}
	
	
	void method1() {
				System.out.println("intro1 called");
	}
	void method2() {
		System.out.println("intro2 called");
	}
	void method3() {
		method1();
		System.out.println("intro3 called");
	}
	void method4() {
		introduct4();
		System.out.println("intro4 called");
	}
	void method5() {
		method4();
		
		System.out.println("intro5 called");
	}
	

	public static void main(String[] args){
		System.out.println("main method started");
		
		
        introduct5();
		
		testdemo t= new testdemo();
		t.method5();
		
		System.out.println("main method ended");

	}

}
