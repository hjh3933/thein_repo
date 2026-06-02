package com.hjh;

public class Cat extends Animal {
	@Override
	public void animalColor() {
		System.out.println("고양이는 치즈색");
	}

	@Override
	public void animalSound() {
		System.out.println("고양이: 냐옹~");
	}

	public void animalColor(boolean b) {
		if (b) {
			super.animalColor();
		} else {

			System.out.println();
		}

	}

	public void animalColorFlag(boolean flag) {
		if (flag) {
			super.animalColor();
		} else {
			animalColor();
		}

	}
}
