package com.hjh.whileloop;

public class Ex8_whileloop2 {

	public static void main(String[] args) {
		// Do while 반복문
		// 조건이 거짓이어도 무조건 1회 실행(Do) 후 조건검증

		// 일반 while 실행 x
		int i = 10;
		while (i < 5) {
			System.out.println("i is " + i);
			i++;
		}
		// Do while 1회 실행
		int j = 10;

		do {
			System.out.println("j is " + j);
			j++;
		} while (j < 5);

	}

}
