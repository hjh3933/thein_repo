package com.hjh;

public class Ex1_Encapsulation {

	public static void main(String[] args) {

		// Car
//		Car car1 = new Car();
//		Car car2 = new Car("Corvette");
//		Car car3 = new Car(1969, "Mustang");
//
//		car1.printInfo();
//		car2.printInfo();
//		car3.printInfo();

		// 캡슐화 private
		Person person1 = new Person();
//		person1.name = "juhee"; 에러발생
//		System.out.println(person1.name); 에러발생
		person1.setName("juhee");
		System.out.println(person1.getName());

	}

}
