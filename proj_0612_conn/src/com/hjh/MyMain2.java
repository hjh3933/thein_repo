package com.hjh;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.hjh.conn.DBConnection;

public class MyMain2 {

	public static void main(String[] args) {
		// 선언부
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = DBConnection.getConnection();
			System.out.println("======conn: " + conn + "=======");
			if (conn != null) {
				String sql = "select * from departments";
//				String sql = "select first_name ||' '|| last_name as fullname from actor\r\n" + "where actor_id < 6";
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery(); // 쿼리를 실행하는 부분

				System.out.println("rs: " + rs);
				while (rs.next()) {
//					System.out.println(rs.getString("fullname"));
					System.out.println("ID: " + rs.getInt("id"));
					System.out.println("NAME: " + rs.getString("name"));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("sql문에 오류가 있음");
		}

		DBConnection.close(conn);
	}
}
