package com.zemoso.Interface;

interface InterfaceDemos{
	static final String a = "static constant";
	public void m1();
	public String m2();
	static void m3() {}
	static int m4() {return 0;}
	
	//private void m5() {}
	
}

public class InterfaceDemo implements InterfaceDemos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceDemo obj = new InterfaceDemo();
		obj.m1();
		obj.m2();
		System.out.println(InterfaceDemos.m4());
	}

	@Override
	public void m1() {
		System.out.println("Hello");
		
		
		
	}

	@Override
	public String m2() {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		return null;
	}

}
