package com.hjh.operators;

public class Ex2_operators4 {

	public static void main(String[] args) {
		// 연산자
		System.out.println("논리연산자 \n ---------");
		boolean isLoggedIn = true;
		boolean isAdmin = false;

		System.out.println("Regular user: " + (isLoggedIn && !isAdmin)); // 모두 참 true
		System.out.println("Has access: " + (isLoggedIn || isAdmin)); // 1개 이상 참 true
		System.out.println("Not logged in: " + (!isLoggedIn)); // !trur => false not연산
	}

}
