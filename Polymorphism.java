package com.zemoso.polymorphism;

class superclass{
	public int mymethod(int x) {
		return -x;
	}
}

public class Polymorphism extends superclass {
	
	public int mymethod(int x) {
		return -(x*x);
	}
	
	public int sum(int a, int b) {
		return a+b;
	}
	public int sum(int a,int b, int c) {
		return a+b+c;
	}

	public static void main(String[] args) {
		Polymorphism obj = new Polymorphism();
		
		
		System.out.println(obj.mymethod(5));
		
		System.out.println("compile time polymorphism-------------");
		
		System.out.println(obj.sum(10, 20));
		System.out.println(obj.sum(10, 20,30));
		

	}

}
