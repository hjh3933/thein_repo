package com.hjh_2;

class Pig extends Animal {
//	String pigName = "꿀꿀이";

	@Override
	void aniEating() {
		System.out.println("돼지는 사료를 먹는다");
	};

	@Override
	void aniSleeping() {
		System.out.println("돼지는 옆으로 누워서 잔다");
	};
}
