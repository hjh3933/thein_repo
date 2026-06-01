package com.hjh;

public class Myobj {

	int x = 5;
	String name = "주희";

	// java 메소드 구분 public void myMethod(int i) 까지를 이름으로 생각
	public void myMethod() {
		System.out.println("myMethod 실행됨");
	}

	public void myMethod(int i) {
		// 1.
		System.out.println("myobj_" + i + " 실행됨");
		// 2.
		String str1 = "myobj_";
		System.out.println(str1 + i + " 실행됨");
		// 3.
		String str2 = "myobj_" + i;
		System.out.println(str2 + " 실행됨");
		// 4.
		String result = str1 + i;
		System.out.println(result + " 실행됨");
	}

}
