package com.hjh;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.hjh.conn.DBConnection2;

public class VoteMain {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = DBConnection2.getConnection();
			System.out.println("hrd 연결 성공");

			if (conn != null) {
				// 1. 방금 작성한 후보조회 JOIN SQL 문
				String sql = "SELECT " + "    m.M_NO AS \"후보번호\", " + "    m.M_NAME AS \"성명\", "
						+ "    p.P_NAME AS \"소속정당\", " + "    CASE m.P_SCHOOL " + "        WHEN '1' THEN '고졸' "
						+ "        WHEN '2' THEN '학사' " + "        WHEN '3' THEN '석사' " + "        WHEN '4' THEN '박사' "
						+ "        ELSE m.P_SCHOOL " + "    END AS \"학력\", "
						+ "    SUBSTRING(m.M_JUMIN FROM 1 FOR 6) || '-' || SUBSTRING(m.M_JUMIN FROM 7 FOR 7) AS \"주민번호\", "
						+ "    m.M_CITY AS \"지역구\", "
						+ "    TRIM(p.P_TEL1) || '-' || TRIM(p.P_TEL2) || '-' || TRIM(p.P_TEL3) AS \"대표전화\" " + "FROM "
						+ "    vote_member m " + "INNER JOIN " + "    vote_party p ON m.P_CODE = p.P_CODE "
						+ "ORDER BY " + "    m.M_NO ASC";

				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();

				// 2. 상단 헤더 출력 (명세서 화면 구성 반영)
				System.out.printf("%-8s %-10s %-10s %-8s %-15s %-10s %-15s\n", "후보번호", "성명", "소속정당", "학력", "주민번호",
						"지역구", "대표전화");
				System.out.println(
						"-------------------------------------------------------------------------------------");

				// 3. ResultSet 반복 및 출력
				while (rs.next()) {
					// SQL Alias(별칭) 또는 컬럼 순서 번호로 값을 꺼내옵니다.
					String mNo = rs.getString("후보번호");
					String mName = rs.getString("성명");
					String pName = rs.getString("소속정당");
					String school = rs.getString("학력");
					String jumin = rs.getString("주민번호");
					String city = rs.getString("지역구");
					String tel = rs.getString("대표전화");

					// 콘솔 정렬 출력 (줄 바꿈 및 여백 조정)
					System.out.printf("%-8s %-10s %-10s %-8s %-15s %-10s %-15s\n", mNo, mName, pName, school, jumin,
							city, tel);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("sql 구문 오류");
		}

		DBConnection2.close(conn);
	}
}
