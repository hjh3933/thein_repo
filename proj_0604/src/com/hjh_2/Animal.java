package com.hjh_2;

class Animal {
	static String myName = "=== 동물프로그램 ===";
	String aniName = "동물이";
	String aniSound = "동물소리";
	int aniAge;

	void aniAge() {
		aniAge = 0;
	}

	void aniEating() {
		System.out.println("동물은 소리를 낸다");
	};

	void aniSleeping() {
		System.out.println("동물은 잠을잔다");
	};

	void info() {
		System.out.println("===== 정보 ======");
		System.out.println("동물의 이름은 " + aniName + "\n동물의 소리는 " + aniSound + "\n" + aniName + "의 나이는 " + aniAge + "입니다");
		aniEating();
		aniSleeping();
		System.out.println("====================");
	}
}
