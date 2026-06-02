package com.hjh;

public class Pig extends Animal {

	@Override
	public void animalSound() {
		System.out.println("돼지: 꿀꿀");
		super.animalSound();
	}
}
