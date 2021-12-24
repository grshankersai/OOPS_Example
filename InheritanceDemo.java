package com.zemoso.inheritance;

//Single Inheritance
class A{
	
	int x;
	
	public void method1(int p) {
		this.x = p;
		System.out.println(x);
	}
}

class B extends A{
	int y;
	
	public void method2(int p, int q) {
		this.y = q;
		super.method1(p);
		System.out.println(y);
	}
}

//multi-level

class C extends B{
	
	public void method3(int p, int q) {
		super.method2(p, q);
	}
	
}


public class InheritanceDemo {

	public static void main(String args[]) {
		C obj = new C();
		obj.method3(10, 20);
	}
}
