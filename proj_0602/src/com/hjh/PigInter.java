package com.hjh;

public class PigInter implements Animal_interface {

	@Override
	public void animalSound() {
		System.out.println("꿀꿀~: 인터페이스 구현완료");
	}

	@Override
	public void sleep() {
		System.out.println("쿨쿨zzz: 인터페이스 구현완료");
	}

}
