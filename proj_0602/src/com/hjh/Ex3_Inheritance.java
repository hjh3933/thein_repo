package com.hjh;

public class Ex3_Inheritance {

	public static void main(String[] args) {
		Car2 car2 = new Car2();
		car2.honk();

		// 상속
		System.out.println(car2.brand);

		// 접근제한자
		// public:protected:default:private
		// 전체 : 패키지+상속 : 패키지 : 클래스

	}

}
