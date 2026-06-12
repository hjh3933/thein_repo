package com.hjh;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import com.hjh.conn.DBConnection2;

public class GolfMain {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = DBConnection2.getConnection();
			System.out.println("hrd연결");

			if (conn != null) {

				String sql = "select * from golf_teacher";
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();

				System.out.printf("%-10s %-10s %-15s %-12s %-15s\n", "강사코드", "강사명", "강의명", "수강료", "자격취득일");
				System.out.println("-------------------------------------------------------------------------");

				NumberFormat nf = NumberFormat.getNumberInstance(Locale.KOREA);

				while (rs.next()) {

					String teacher_code = rs.getString("teacher_code");
					String teacher_name = rs.getString("teacher_name");
					String class_name = rs.getString("class_name");

					int class_price = rs.getInt("class_price");
					String price = "₩" + nf.format(class_price);

					String rawDate = rs.getString("teacher_regist_date");
					SimpleDateFormat input = new SimpleDateFormat("yyyyMMdd");
					SimpleDateFormat output = new SimpleDateFormat("yyyy년MM월dd일");
					Date date = input.parse(rawDate);
					String formattedDate = output.format(date);

					System.out.printf("%-10s %-10s %-15s %-12s %-15s\n", teacher_code, teacher_name, class_name, price,
							formattedDate);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("sql 구문 오류");
		}

		DBConnection2.close(conn);
	}
}
