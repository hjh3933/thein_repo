package com.hjh2;

enum Level2 {
	LOW("Low level"), MEDIUM("Medium level"), HIGH("High level");

	// enum에서 사용할 일반변수
	private String description;

	// 생성자
	private Level2(String description) {
		this.description = description;
	}

	// enum에서 사용하는 일반메서드
	public String getDescription() {
		return description;
	}
}
