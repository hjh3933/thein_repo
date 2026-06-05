package com.hjh_5;

public class MyMain5 {

	public static void main(String[] args) {
		// 부모 타입으로 가져옴
		Payment p0 = new Payment();
		Payment p1 = new CardPayment();
		Payment p2 = new TossPay();

		// 그래도 다형성에 따라 다른 메소드가 나옴 부모꺼 나오는거 아님
		p0.pay(999);
		p1.pay(10000);
		p2.pay(20000);

	}

}
