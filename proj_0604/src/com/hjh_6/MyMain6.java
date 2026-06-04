package com.hjh_6;

import java.util.Random;
import java.util.Scanner;

public class MyMain6 {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);

		// 랜덤으로 otp를 생성한다 0~899999
		int otp = 100000 + random.nextInt(900000);

		System.out.println("생성 OTP: " + otp);

		int failCount = 0;

		while (true) {
			// 사용자에게 otp를 입력받는다
			System.out.println("OTP 입력: ");
			int input = sc.nextInt();

			if (input == otp) {
				// 인증 성공: 반복문 종료
				System.out.println("인증 성공");
				break;
			} else {
				// 인증 실패시 실패 횟수를 카운트
				failCount++;
				System.out.println("인증 실패");

				// 3회 이상 실패시 계정 잠금(조건문 종료)
				if (failCount >= 3) {
					System.out.println("계정 잠금");
					break;
				}
			}
		}

	}

}
