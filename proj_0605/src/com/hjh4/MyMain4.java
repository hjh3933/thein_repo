package com.hjh4;

public class MyMain4 {

	public static void main(String[] args) {
		// 문법 오류: 코드를 쳤을 때
		// 1. 세미콜론 누락
		// Syntax error, insert ";" to complete BlockStatements
		// int x = 5
		// System.out.println(x);

		// 2. 선언되지 않은 변수
		// myVar cannot be resolved to a variable
		// System.out.println(myVar);

		// 3. 유형 불일치
		// Type mismatch: cannot convert from String to int
		// int x = "Hello";

		// 런타임 오류: 실행 중 오류
		// 1) 0으로 나누기
		// java.lang.ArithmeticException: / by zero
//		int x = 10;
//		int y = 0;
//		int result = x / y;
//		System.out.println(result);

		// 2) 배열 인덱스 범위를 벗어남
		// java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 3
		int[] numbers = { 1, 2, 3 };
		System.out.println(numbers[8]);

		// 논리적 오류: 실제 오류는 없지만 예상과 다른 결과가 발생
		int x = 10;
		int y = 2;
		int sum = x - y;
		System.out.println("x + y = " + sum);

	}

}
