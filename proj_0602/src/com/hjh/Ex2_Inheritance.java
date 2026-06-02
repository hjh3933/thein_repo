package com.hjh;

public class Ex2_Inheritance extends Vehicle {

	private String modelName = "Mustang";

	public static void main(String[] args) {
		// extends
		// 부모로 직접 접근
//		Vehicle vehicle = new Vehicle();
//		vehicle.honk();

		// 자식 접근
		Ex2_Inheritance ex2_Inheritance1 = new Ex2_Inheritance();
		// 상속받은 메서드
		ex2_Inheritance1.honk();
		// 상속받은 필드 + 본인 필드
		System.out.println(ex2_Inheritance1.brand + " " + ex2_Inheritance1.modelName);

	}

}
