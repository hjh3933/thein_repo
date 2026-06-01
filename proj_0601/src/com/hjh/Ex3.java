package com.hjh;

public class Ex3 {

	public static void main(String[] args) {
		// 계산기 클래스를 사용하여 사칙연산을 담당하는 계산기를 작성합시다
//		int num1;
//		int num2;
//		String strResult;
		int result;

		Calc calc = new Calc();

		calc.add(20, 6);
		calc.minus(20, 6);
		calc.multi(20, 6);
		calc.divide(20, 6);
		calc.remind(20, 6);

		System.out.println("===============");
		// result 결과값을 받아서 출력하기
		result = calc.add2(20, 6);
		System.out.println("덧셈 리턴값은: " + result);
		result = calc.minus2(20, 6);
		System.out.println("뺄셈 리턴값은: " + result);
		result = calc.multi2(20, 6);
		System.out.println("곱셈 리턴값은: " + result);
		result = calc.divide2(20, 6);
		System.out.println("나눗셈 리턴값은: " + result);
		result = calc.remind2(20, 6);
		System.out.println("나머지 리턴값은: " + result);
	}

}
