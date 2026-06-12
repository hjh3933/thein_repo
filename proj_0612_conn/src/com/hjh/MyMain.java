package com.hjh;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.hjh.conn.DBConnection;

public class MyMain {

	public static void main(String[] args) {
		Connection conn = DBConnection.getConnection();
		System.out.println("======conn: " + conn + "=======");

		if (conn != null) {
			System.out.println("DB 연결 성공!");
			try {
				// SQL 작업 현재 db- dvdrental
//				String sql = "select * from ployees";
				String sql = "select * from employees";
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql);

				// rs.next 결과(튜플)가 있으면 계속 반복
				while (rs.next()) {
					// 컬럼을 대칭해서 출력해보셈
					// rs.getInt("employee_id");컬럼명으로 출력
					// rs.getInt(1);컬럼순서로 출력 1부터 시작임
					System.out.println(rs.getInt(1));
				}
			} catch (Exception e) {
				e.printStackTrace();
				// "ployees" 이름의 릴레이션(relation)이 없습니다
				System.out.println("sql문에 오류가 있음");
			}

			DBConnection.close(conn);
		}
	}

}
