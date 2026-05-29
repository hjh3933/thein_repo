package com.hjh.scan;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		System.out.println("===두 숫자의 합을 구하기===");
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 숫자: ");
		int n = scan.nextInt();
		System.out.println("두번째 숫자: ");
		int m = scan.nextInt();
		System.out.println("두 숫자의 합: ");
		System.out.println(n + m);

	}

}
