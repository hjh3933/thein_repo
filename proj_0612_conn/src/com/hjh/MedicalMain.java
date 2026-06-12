package com.hjh;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.hjh.conn.DBConnection2;

public class MedicalMain {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = DBConnection2.getConnection();
			System.out.println("hrd 연결 성공");

			if (conn != null) {
				String sql = "SELECT " + "    p.p_city AS \"지역코드\", " + "    COUNT(r.test_code) AS \"검사건수\" " + "FROM "
						+ "    me_patient p " + "INNER JOIN " + "    me_result r ON p.p_no = r.p_no " + "GROUP BY "
						+ "    p.p_city " + "ORDER BY " + "    p.p_city ASC";

				pstmt = conn.prepareStatement(sql);

				// 조회용 쿼리이므로 executeQuery() 사용
				rs = pstmt.executeQuery();

				System.out.println("=========================================");
				System.out.println("지역코드\t지역명\t\t검사건수");
				System.out.println("=========================================");

				// 지역명 매핑 및 출력 처리
				while (rs.next()) {
					String cityCode = rs.getString("지역코드");
					int count = rs.getInt("검사건수");
					String cityName = "";

					switch (cityCode) {
					case "10":
						cityName = "서울";
						break;
					case "20":
						cityName = "경기";
						break;
					case "30":
						cityName = "강원";
						break;
					case "40":
						cityName = "대구";
						break;
					default:
						cityName = "기타";
						break;
					}

					System.out.println(cityCode + "\t\t" + cityName + "\t\t" + count + "건");
				}
				System.out.println("=========================================");
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("sql 구문 오류 또는 데이터 제약조건 위반");
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			DBConnection2.close(conn);
		}
	}
}
