package com.hjh_4;

abstract class Animal implements InterAnimal {

	// void animalSound();
	@Override
	public void run() {
		System.out.println("동물이 산책합니다.");
	}

	@Override
	public void sleep() {
		System.out.println("동물이 잠을 잡니다");
	}

}
