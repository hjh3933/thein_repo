package com.hjh;

public class Car {
	int modelYear;
	String modelName;

	public Car() {
		System.out.println("기본생성자");
	}

	public Car(String modelName) {
		// 2개의 매개변수를 받는 생성자를 호출한다
		this(2026, modelName);
		System.out.println(modelName);

		// this.현재클래스 소속 = 매개변수요소
		this.modelName = modelName;
		System.out.println("this.modelName: " + this.modelName);
	}

	public Car(int modelYear, String modelName) {
		System.out.println(modelYear);
		System.out.println(modelName);

		this.modelYear = modelYear;
		this.modelName = modelName;
		System.out.println("this.modelYear: " + this.modelYear);
		System.out.println("this.modelName: " + this.modelName);
	}

	public void printInfo() {
		System.out.println(modelYear + " " + modelName);

	}

}
