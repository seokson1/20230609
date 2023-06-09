package com.yedam.list;

class Emp {
	int id;
	String name;
}

public class CallByEx {
	public static void main(String[] args) {
		// call by value.
		int a = 10;
		meth1(a);
		System.out.println(a);

		// call by reference.
		Emp emp = new Emp();
		emp.name = "홍길동";
		meth2(emp);
		System.out.println(emp.name);

		// String, Wrapper - 객체 > 메소드의 인수 사용 value; 취급
		String b = "hello";
		meth3(b);
		System.out.println(b);
	}

	public static void meth1(int a) {
		a = a * a;
	}

	public static void meth2(Emp e) {
		e.name = "김길동";
	}

	public static void meth3(String str) {
		str = "world";
	}

}
