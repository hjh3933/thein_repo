package com.hjh_2;

class Cat extends Animal {
//	String catName;

	@Override
	void aniEating() {
		System.out.println("고양이는 츄르를 먹는다");
	};

	@Override
	void aniSleeping() {
		System.out.println("고양이는 웅크려서 잔다");
	};
}
