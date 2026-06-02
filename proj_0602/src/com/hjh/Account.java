package com.hjh;

public class Account {
	String accountNumber;
	String owner;
	int balance;

	// 생성자: 값을 초기화
	public Account(String accountNumber, String owner, int balance) {
		this.accountNumber = accountNumber;
		this.owner = owner;
		this.balance = balance;
	}

	// 입금
	void deposit(int amount) {
//		balance = balance + amount;
		balance += amount;
		System.out.println(amount + "원 입금 완료");
	}

	// 출금
	void witdraw(int amount) {
		if (amount > balance) {
			System.out.println("잔액 부족");
			return;
		}
		balance -= amount;
		System.out.println(amount + "원 출금 완료");
	}

	// 계좌정보조회
	void showInfo() {
		System.out.println("계좌번호: " + accountNumber);
		System.out.println("예금주: " + owner);
		System.out.println("잔액: " + balance);

	}

}
