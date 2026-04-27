package com.javaintro;

public class Hello {
	public static void main(String args[]) throws ClassNotFoundException{
		System.out.println("HelloWorld1");
		Class.forName("java.lang.System");
		System.out.println("HelloWorld2");
	}

}
