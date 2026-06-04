package com.hjh_2;

public class MyMain2 {

	public static void main(String[] args) {
		System.out.println(Animal.myName);

		Pig pig1 = new Pig();
//		System.out.println(pig1.pigName);
		pig1.aniName = "도야지";
		pig1.aniSound = "꿀꿀";
		System.out.println(pig1.aniName);
		System.out.println(pig1.aniSound);
		pig1.aniEating();
		pig1.aniSleeping();
		pig1.info();

		Cat cat1 = new Cat();
//		System.out.println(cat1.catName);
		cat1.aniName = "나비";
		cat1.aniSound = "냐옹";
		System.out.println(cat1.aniName);
		System.out.println(cat1.aniSound);
		cat1.aniEating();
		cat1.aniSleeping();
		cat1.info();

		Dog dog1 = new Dog();
//		System.out.println(dog1.dogName);
		dog1.aniName = "백구";
		dog1.aniSound = "멍멍";
		System.out.println(dog1.aniName);
		System.out.println(dog1.aniSound);
		dog1.aniEating();
		dog1.aniSleeping();
		dog1.info();

		Bird bird1 = new Bird();
//		System.out.println(bird1.birdName);
		bird1.aniName = "참새";
		bird1.aniSound = "짹짹";
		System.out.println(bird1.aniName);
		System.out.println(bird1.aniSound);
		bird1.aniEating();
		bird1.aniSleeping();
		bird1.babing();
		System.out.println(bird1.baby);
		bird1.info();
	}

}
