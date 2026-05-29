package com.hjh.conditions;

public class Ex6_conditions {

	public static void main(String[] args) {
		// 조건문

		// if 만약 a 라면
		int x = 20;
		int y = 18;
		if (x > y) {
			System.out.println("x is greater than y");
		}

		// else a가 아닌 모든 경우
		boolean isRaining = false;

		if (isRaining) {
			System.out.println("Bring an umbrella!");
		} else {
			System.out.println("No rain today, no need for an umbrella!");
		}

		// else if a가 아닌 b인 경우
		int weather = 2; // 1 = raining, 2 = sunny, 3 = cloudy

		if (weather == 1) {
			System.out.println("Bring an umbrella.");
		} else if (weather == 2) {
			System.out.println("Wear sunglasses.");
		} else {
			System.out.println("Just go outside normally.");
		}
	}

}
