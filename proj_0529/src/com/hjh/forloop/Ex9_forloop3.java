package com.hjh.forloop;

public class Ex9_forloop3 {

	public static void main(String[] args) {
		// for each문
		// 배열을 돌면서 각 요소에 접근한다
		String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };

		for (String car : cars) { // car는 임의로 본인이 설정한 변수명
			System.out.println(car); // 배열의 요소를 순서대로 접근
		}
	}

}
