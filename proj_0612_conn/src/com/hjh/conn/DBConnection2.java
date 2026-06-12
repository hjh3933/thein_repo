package com.hjh.conn;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection2 {
	private static final String URL = "jdbc:postgresql://localhost:5432/hrd";
	private static final String USER = "postgres";
	private static final String PASSWORD = "1234";

	public static Connection getConnection() {

		try {
			return DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("연결정보 오류");
			return null;
		}
	}

	public static void close(Connection conn) {

		try {
			if (conn != null) {
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
