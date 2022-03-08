package com.roytuts.junit.mock.superclass.method;

public class Child extends Parent {

	public void show() {
		System.out.println("Inside Child's show() method");
		display();
		System.out.println("After calling Parent's dispaly() method");
	}

	public String getWelcomeMsg(String name) {
		System.out.println("Inside Child's getWelcomeMsg() method");
		return getMsg(name);
	}

}
