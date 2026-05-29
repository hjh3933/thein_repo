package com.hjh.conditions;

public class Ex6_conditions2 {

	public static void main(String[] args) {
		// 삼항 연산자 variable = (조건) ? 참일때 : 아닐때;

		// 기존 if문
		int time = 20;
		if (time < 18) {
			System.out.println("Good day.");
		} else {
			System.out.println("Good evening.");
		}

		// 삼항으로
		String result = (time < 18) ? "Good day." : "Good evening.";
		System.out.println(result);

		// 중첩도 가능
		String message = (time < 12) ? "Good morning." : (time < 18) ? "Good afternoon." : "Good evening.";
		System.out.println(message);
	}

}
