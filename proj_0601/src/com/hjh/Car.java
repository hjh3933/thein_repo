package com.hjh;

public class Car {
	String brand;
	int modelYear;
	String modelName;
	String modelColor;
	int maxSpeed;

	public Car(String string3, int i, String string, String string2, int j) {
		brand = string3;
		modelYear = i;
		modelName = string;
		modelColor = string2;
		maxSpeed = j;
	}

	public void introduce() {
		System.out.println(
				"소개해드릴차는 " + modelName + "입니다. \n" + ((modelYear > 2025) ? "이번 해인 " : (2026 - modelYear) + "년 전인 ")
						+ modelYear + "년에 출시했고 최고속도는 " + maxSpeed + "km입니다");
	}

	public void changeColor(String color) {
		System.out.print("차량 색상을 기존 " + modelColor + "에서 ");
		modelColor = color;
		System.out.print(modelColor + "컬러로 변경하였습니다 \n");
	}

}
