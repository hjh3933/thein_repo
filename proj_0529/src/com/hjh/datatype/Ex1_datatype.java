package com.hjh.datatype;

public class Ex1_datatype {

	public static void main(String[] args) {
		int myIntNum = 5; // 4byte (32bit)
		float myFloatNum = 5.99f;
		char myLetter = 'D';
		boolean myBool = true;
		double myDouble = 20.000; // 8byte (64bit)
		String myText = "Hello";

		System.out.println("자동 타입캐스팅\n--------\nbyte -> short -> char -> int -> long -> float -> double");
		System.out.println("수동 타입캐스팅\n--------\ndouble-> float-> long-> int-> char-> short->byte");

		// int -> double (자동)
		double resultDouble = myIntNum;
		System.out.println("int타입의 값을 double타입의 변수에 대입: " + resultDouble);

		// double -> int (수동)
		int resultInt = (int) myDouble;
		System.out.println("double타입의 값을 int타입의 변수에 대입하려면\n***타입캐스팅 필요*** : " + resultInt);

	}

}
