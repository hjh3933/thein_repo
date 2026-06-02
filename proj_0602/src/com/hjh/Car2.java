package com.hjh;

public class Car2 extends Vehicle2 {
	private String modelName = "Mustang";

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public void honk() {
		System.out.println("Tuut, tuut!");

		// 부모 필드에 접근
		System.out.println("super필드: " + super.brand);
	}

}
