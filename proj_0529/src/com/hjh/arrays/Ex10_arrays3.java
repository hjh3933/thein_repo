package com.hjh.arrays;

public class Ex10_arrays3 {

	public static void main(String[] args) {
		// 다차원 배열 [][][]...
		// 선언 [행][열]: 이차원 배열 예시
		int[][] myNumbers = { { 1, 4, 2 }, { 3, 6, 8 } };
		int[][] myNumbers2 = new int[2][3];

		System.out.println(myNumbers[1][2]); // 2번째 행의 3번째 요소 8 출력

		// 변경
		myNumbers[1][2] = 9;
		System.out.println(myNumbers[1][2]); // 9 출력

		// 길이: 열의 길이는 이중으로 접근해야 함
		int[][] myNumbers3 = { { 1, 4, 2 }, { 3, 6, 8, 5, 2 } };
		System.out.println("Rows: " + myNumbers3.length); // 2
		System.out.println("Cols in row 0: " + myNumbers3[0].length); // 3
		System.out.println("Cols in row 1: " + myNumbers3[1].length); // 5

		// 배열순회: 중첩 반복문을 통해 가능 for, for each 둘 다 가능함
		int[][] myNumbers4 = { { 1, 4, 2 }, { 3, 6, 8, 5, 2 } };

		for (int[] row : myNumbers4) {
			for (int num : row) {
				System.out.println(num);
			}
		}
	}

}
