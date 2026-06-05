package com.hjh;

public class MyMain {

	public static void main(String[] args) {
		// 익명 클래스 - 반드시 무언가를 상속받는 자식클래스
		// 상속받을게 없으면 Object 를 적어서 기본상속하고 구현
		Greeting greet = new Greeting() {
			@Override
			public void sayHello() {
				System.out.println("나는 인터페이스를 구현한 익명 클래스");
			}
		};
		greet.sayHello();

	}

}
