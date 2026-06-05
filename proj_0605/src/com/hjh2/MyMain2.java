package com.hjh2;

public class MyMain2 {

	public static void main(String[] args) {
		/**
		 * 💡 [나만의 족보] Java Enum 핵심 특징 총정리
		 * 
		 * 1. 상수 목록 관리 전용 클래스 - 본질은 클래스이며, 몇 개의 정해진 상수 객체만 안전하게 돌려쓰기 위한 특별한 타입이다.
		 * 
		 * 2. 상수 목록의 형태(포맷) 일치 필수 - 상수는 이름만 적거나, 괄호()를 써서 매개변수를 받는 형태로 사용할 수 있다. - 단, 한
		 * 상수가 괄호를 쓰면 모든 상수가 같은 개수와 타입의 괄호 포맷을 맞춰야 하며, 이를 받아줄 '일반 필드(변수)'와 '생성자'가 아래에
		 * 반드시 세트로 구현되어야 한다.
		 * 
		 * 3. 상수 이름 자동 문자열 변환 - 상수 필드의 이름을 출력(System.out.println)하면, 별도의 설정 없이도 해당 이름이
		 * 문자열(String)로 자동으로 출력되도록 내부에 마법(toString)이 걸려있다.
		 * 
		 * 4. 객체 생성 불가 & 상수 객체를 통한 필드/메서드 접근 - enum은 외부에서 'new' 키워드로 새 객체를 만들 수 없다. (자바가
		 * 생성자 문을 잠금) - 하지만 맨 위에 적어둔 상수 목록 자체가 이미 자바가 시작할 때 미리 만들어둔 '진짜 객체'이다. - 따라서 일반
		 * 필드나 일반 메서드는 'Level.LOW.score' 또는 'Level.LOW.print()' 처럼 이미 존재하는 상수 객체 뒤에
		 * 점('.')을 찍어서 자유롭게 접근한다.
		 * 
		 * 5. switch문에서의 문법적 편의 (생략 마법) - enum 타입을 switch문에 넣으면, 자바가 문맥을 파악하여 'case
		 * Level.LOW:' 대신 'Level.'을 통째로 생략하고 대문자 이름만 냅다 적어도('case LOW:') 알아서 찰떡같이 이해한다.
		 */

		// new 키워드 사용불가
		Level myVar = Level.MEDIUM;
		System.out.println(myVar); // 알아서 MEDIUM으로 인식

		switch (myVar) {
		case LOW:
			System.out.println("LOW level");
			break;
		case MEDIUM:
			System.out.println("MEDIUM level");
			break;

		case HIGH:
			System.out.println("HIGH level");
			break;

		}
		System.out.println("=== level for in ===");
		for (Level v : Level.values()) {
			System.out.println(v);
		}

		System.out.println("=== level2 ===");
		Level2 myVar2 = Level2.MEDIUM;
		System.out.println(myVar2);

		for (Level2 v2 : Level2.values()) {
			System.out.println(v2 + ": " + v2.getDescription());
		}

	}

}
