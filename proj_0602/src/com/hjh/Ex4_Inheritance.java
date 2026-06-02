package com.hjh;

public class Ex4_Inheritance {

	public static void main(String[] args) {
		Pig pig = new Pig();
		Dog dog = new Dog();

		// 다형성 테스트 override
		dog.animalSound();
		pig.animalSound();
		System.out.println("===================");

		// 1. 고양이 오브젝트 생성
		Cat cat = new Cat();
		// 2. 동물들의 털 색상 출력
		cat.animalColorFlag(true);
//		cat.animalColor(true);
		// 3. 치즈냥이 털 색상 출력
//		cat.animalColor(false);
		cat.animalColorFlag(false);

	}

}
