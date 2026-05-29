package com.hjh.strings;

public class Ex3_strings {

	public static void main(String[] args) {
		// 문자열 String 변수명 = "내용"
		String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		// 문자열 메소드
		System.out.println("The length of the txt string is: " + txt.length()); // 길이
		System.out.println(txt.toUpperCase()); // 대문자
		System.out.println(txt.toLowerCase()); // 소문자
		System.out.println(txt.indexOf("length")); // 위치 찾기
		System.out.println(txt.charAt(0)); // 문자 찾기

		String txt1 = "Hello";
		String txt2 = "Hello";
		System.out.println(txt1.equals(txt2)); // 비교하기

		String txt3 = "   Hello World   ";
		System.out.println("After:  [" + txt3.trim() + "]"); // 공백제거
	}

}
