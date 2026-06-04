package com.hjh_2;

class Dog extends Animal {
//	String dogName;

	@Override
	void aniEating() {
		System.out.println("개는 개껌을 씹는다");
	};

	@Override
	void aniSleeping() {
		System.out.println("개는 엎드려서 잔다");
	};
}
