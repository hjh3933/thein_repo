package com.hjh;

public class MyCar {
	int modelYear;
	String modelName;

	public MyCar() {
		// TODO Auto-generated constructor stub
	}

	// 매개변수 i
	// argument 1개 있다
	public MyCar(int i) {
		// TODO Auto-generated constructor stub
	}

	public MyCar(int year, String name) {
		System.out.println(year + "   " + name);
		modelYear = year;
		modelName = name;
	}

}
