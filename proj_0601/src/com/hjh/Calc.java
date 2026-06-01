package com.hjh;

public class Calc {

	public void add(int num1, int num2) {
		System.out.println(num1 + num2);
	}

	public void minus(int num1, int num2) {
		System.out.println(num1 - num2);
	}

	public void multi(int num1, int num2) {
		System.out.println(num1 * num2);
	}

	public void divide(int num1, int num2) {
		System.out.println(num1 / num2);
	}

	public void remind(int num1, int num2) {
		System.out.println(num1 % num2);
	}

	// 리턴값이 있는 더하기 기능
	public int add2(int i, int j) {
		return i + j;
	}

	public int minus2(int i, int j) {
		return i - j;
	}

	public int multi2(int i, int j) {
		return i * j;
	}

	public int divide2(int i, int j) {
		return i / j;
	}

	public int remind2(int i, int j) {
		return i % j;
	}

}
