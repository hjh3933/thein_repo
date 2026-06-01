package com.hjh;

public class Ex1 {

	public static void main(String[] args) {

		Myobj myobj_1 = new Myobj();
		Myobj myobj_2 = new Myobj();
		Myobj myobj_3 = new Myobj();
		System.out.println(myobj_1.x);
		System.out.println(myobj_1.name);
		System.out.println(myobj_2.x);
		System.out.println(myobj_2.name);
		System.out.println(myobj_3.x);
		myobj_3.x = 10;
		myobj_3.name = "지수";
		System.out.println(myobj_3.x); // 10
		System.out.println(myobj_3.name);
		System.out.println(myobj_2.x); // 5
		System.out.println(myobj_2.name);

		myobj_1.myMethod();
		myobj_2.myMethod();
		myobj_3.myMethod();

		myobj_1.myMethod(1);
		myobj_2.myMethod(2);
		myobj_3.myMethod(3);

	}

}
