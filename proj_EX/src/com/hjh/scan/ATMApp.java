package com.hjh.scan;

import java.util.Scanner;

public class ATMApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int balance = 0;

		while (true) {

			System.out.println("====ATM====");
			System.out.println("1. 입금");
			System.out.println("2. 출금");
			System.out.println("3. 잔액조회");
			System.out.println("4. 종료");
			System.out.print("선택 > ");

			int menu = scan.nextInt();

			switch (menu) {
			case 1:
				System.out.print("입금액: ");
				int deposit = scan.nextInt();
				balance += deposit;
				System.out.println(deposit + "원 입금완료, 현재 잔액: " + balance + "원");
				break;
			case 2:
				System.out.print("출금액: ");
				int withdraw = scan.nextInt();

				String answer;
				if (withdraw > balance) {
					answer = "잔액 부족";
				} else {
					balance -= withdraw;
					answer = withdraw + "원 출금완료, 현재 잔액: " + balance + "원";
				}
				System.out.println(answer);
				break;
			case 3:
				System.out.println("현재 잔액: " + balance);
				break;
			case 4:
				System.out.print("ATM을 종료합니다");
				return;
			default:
				System.out.println("잘못된 입력입니다. 원하시는 업무의 번호를 입력해주세요");
			}

		}
	}

}
