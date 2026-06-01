package com.hjh;

public class Ex4_Car {

	public static void main(String[] args) {
		// 제조연도, 모델이름, 색상?, 최고속도?
		Car car1 = new Car("Ford", 1969, "Mustang", "White", 190);
		Car car2 = new Car("Porsche", 2023, "911 GT3 RS", "Red", 296);
		Car car3 = new Car("Hyundai", 2026, "Ioniq 5N", "Blue", 260);

		System.out.println(car1.brand);
		System.out.println(car2.modelColor);
		car2.introduce();
		car3.introduce();

		car2.changeColor("Green");
		System.out.println(car2.modelColor);

	}

}
