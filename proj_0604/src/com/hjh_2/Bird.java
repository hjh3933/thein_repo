package com.hjh_2;

class Bird extends Animal {
	String baby;

	void babing() {
		this.baby = "알을 낳습니다";
	}

	@Override
	void aniEating() {
		System.out.println("새는 벌레를 먹는다");
	};

	@Override
	void aniSleeping() {
		System.out.println("새는 깃털에 고개를 묻고 잔다");
	};
}
