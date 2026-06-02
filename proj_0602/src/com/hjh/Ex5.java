package com.hjh;

public class Ex5 {

	public static void main(String[] args) {
		// 클래스 기준 static
		// 저장공간이 "클래스"에 저장되는것 오직 하나
		// 변경하면 모두다 변한다
		// static이 아닌 s1.name, s2.name 은 각각 저장되는거
		System.out.println(StaticClass.staticVal);
		System.out.println("변경 전: " + StaticClass.staticIntVal);
		StaticClass.staticIntVal = 200;
		System.out.println("변경 후: " + StaticClass.staticIntVal);

		// 오브젝트 기준

		StaticClass s1 = new StaticClass();
		StaticClass s2 = new StaticClass();
		StaticClass s3 = new StaticClass();

		System.out.println("변경 전: " + s1.color);
		s1.color = "red";
		s2.color = "yellow";
		s3.color = "green";
		System.out.println("변경 후: " + s1.color);

	}

}
