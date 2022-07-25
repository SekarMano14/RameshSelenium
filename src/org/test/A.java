package org.test;

public class A {
	public static void add() {
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println(c);

	}

	private void sub() {
		int a = 10;
		int b = 20;
		int c = a - b;
		System.out.println(c);

	}

	public static void main(String[] args) {
		A c = new A();
		c.add();
		c.sub();
	}

}
