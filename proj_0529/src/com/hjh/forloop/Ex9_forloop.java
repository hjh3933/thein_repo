package com.hjh.forloop;

public class Ex9_forloop {

	public static void main(String[] args) {
		// for 반복문
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		// 실행순서
		int i = 0; // 최초 1회
		boolean result = i < 5; // 반복문 시작 전 매번 검증
		i++; // 반복문 실행 후 매번 증감

	}

}
