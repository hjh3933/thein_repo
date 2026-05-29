package com.hjh.switches;

public class Ex7_switches {

	public static void main(String[] args) {
		// switch 조건문
		// 각각의 조건이 case, 만족하면 break
		int day = 4;
		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		}
		// break가 없으면 다음 실행 case로 넘어간다는 점이 if문과 다른점이다 이 부분을 사용하여 특정 조건을 만족하면 여러 실행문을
		// 실행하도록 할 수도 있음

	}

}
