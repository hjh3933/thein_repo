package com.hjh.forloop;

public class Ex9_forloop2 {

	public static void main(String[] args) {
		// 중첩 for문
		// 이차원 배열을 표현할 수 있다
		// 일반적으로 i j k l m
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				System.out.print(i * j + " ");
			}
			System.out.println();
		}

	}

}
