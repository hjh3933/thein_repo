package com.hjh;

class Account {
	String accountNumber;
	String owner;
	int balance;

	Account(String accountNumber, String owner, int balance) {
		this.accountNumber = accountNumber;
		this.owner = owner;
		this.balance = balance;

		myPrint();
	}

	private void myPrint() {
		System.out.println(accountNumber + ": " + owner + ": ");

	}

	String depositEx(int amount) {
		balance += amount;
		return amount + "원 입금 완료 \n잔액: " + balance;
	}

	void deposit(int amount) {
		balance += amount;
		System.out.println(amount + "원 입금 완료");
	}

	void witdraw(int amount) {
		if (amount > balance) {
			System.out.println("잔액 부족");
			return;
		}
		balance -= amount;
		System.out.println(amount + "원 출금 완료 \n잔액: " + balance);
	}

	void showInfo() {
		System.out.println("계좌번호: " + accountNumber);
		System.out.println("예금주: " + owner);
		System.out.println("잔액: " + balance + "원");

	}
}
