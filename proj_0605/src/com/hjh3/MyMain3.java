package com.hjh3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class MyMain3 {

	public static void main(String[] args) {
		// pc 기준으로 로컬 날짜 출력
		LocalDate myObj = LocalDate.now();
		System.out.println(myObj); // 2026-06-05

		// 시간
		LocalTime myObj2 = LocalTime.now();
		System.out.println(myObj2); // 12:19:00.836025100

		// 날짜와 시간
		LocalDateTime myObj3 = LocalDateTime.now();
		System.out.println("format X:" + myObj3); // 2026-06-05T13:48:49.025414900

		// format 설정 2026년-05월-06일 13시 56분 50초
		DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("yyyy년-dd월-MM일 HH시 mm분 ss초");
		String formattedDate = myObj3.format(myFormat);
		System.out.println("format O: " + formattedDate);
	}

}
