package com.hjh.arrays;

public class Ex10_arrays {

	public static void main(String[] args) {
		// 배열
		// 선언 데이터타입[] 변수명;
		String[] cars = { "Volvo", "BMW", "Ford", "Mazda" }; // 바로 초기화
		String[] cars2 = new String[4]; // 개수와 함께 선언

		// 인덱스를 통해 접근
		System.out.println(cars[0]); // 0번 요소 Volvo 출력

		// 인덱스를 통해 접근하여 요소 변경
		cars[0] = "Opel";
		System.out.println(cars[0]); // 0번 요소 Opel 출력
		System.out.println(cars.length); // 길이 접근
		// String도 배열의 한 종류라는 것을 알 수 있다

	}

}
