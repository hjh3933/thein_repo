package com.hjh;

public class MyMain1 {

	public static void main(String[] args) {
		Account acc = new Account("100-200", "성시경", 100000);
		// String return
		String depositResult = acc.depositEx(8000);
		System.out.println(depositResult);
		// void
		acc.deposit(8000);
		acc.witdraw(10000);
		acc.showInfo();
	}

}
