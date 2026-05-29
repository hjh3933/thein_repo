package com.hjh.strings;

public class Ex3_strings2 {

	public static void main(String[] args) {
		// 문자열 연결
		String firstName = "John";
		String lastName = "Doe";
		System.out.println(firstName + " " + lastName);

		// concat: 여러 문자열 연결(근데 보통 + 많이씀)
		String a = "Java ";
		String b = "is ";
		String c = "fun!";
		String result = a.concat(b).concat(c);
		System.out.println(result);

		// 숫자 + 문자열 = 문자열
		String x = "10";
		int y = 20;
		String z = x + y;
		System.out.println(z); // 1020

	}

}
