package com.hjh.conditions;

public class Ex6_conditions3 {

	public static void main(String[] args) {
		// if문 중첩
		int x = 15;
		int y = 25;

		if (x > 10) {
			System.out.println("x is greater than 10");

			// Nested if
			if (y > 20) {
				System.out.println("y is also greater than 20");
			}
		}

		// 논리 연산자와 if문 결합
		int a = 200;
		int b = 33;
		int c = 500;

		if (a > b && c > a) {
			System.out.println("Both conditions are true");
		}
	}

}
