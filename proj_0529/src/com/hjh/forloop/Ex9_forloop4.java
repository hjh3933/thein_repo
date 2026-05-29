package com.hjh.forloop;

public class Ex9_forloop4 {

	public static void main(String[] args) {
		// break
		// 반복문, 조건문을 중단하고 탈출할 수 있다
		for (int i = 0; i < 10; i++) {
			if (i == 4) {
				break; // 10이상의 조건을 충족하지 않더라고 4가되면 중단한다
			}
			System.out.println(i);
		}

		// continue
		// 특정 조건을 충족하면 반복문을 지나간다
		for (int i = 0; i < 10; i++) {
			if (i == 4) {
				continue; // i가 4가 되면 아래 출력문 실행하지 않고 다음 턴으로 뛰어넘음
			}
			System.out.println(i);
		}

	}

}
