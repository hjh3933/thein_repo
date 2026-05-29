package com.hjh.arrays;

public class Ex10_arrays2 {

	public static void main(String[] args) {
		// 배열 순회
		String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
		// for문으로 순회하기

		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
		// for each문으로 순회하기
		for (String car : cars) {
			System.out.println(car);
		}
	}

}
