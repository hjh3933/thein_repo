package com.hjh;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.hjh.conn.DBConnection2;

public class AcademicMain {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		String sno = "10103";
		int ekor = 84;
		int eeng = 85;
		int emath = 99;
		int ehist = 100;

		try {
			conn = DBConnection2.getConnection();
			System.out.println("hrd 연결 성공");

			if (conn != null) {
				String sql = "INSERT INTO ac_exam (sno, ekor, eeng, emath, ehist) VALUES (?, ?, ?, ?, ?)";

				pstmt = conn.prepareStatement(sql);

				// 물음표(?) 위치에 데이터 매핑 (1번부터 시작)
				pstmt.setString(1, sno); // 첫 번째 ? : 학생번호 (VARCHAR이므로 setString)
				pstmt.setInt(2, ekor); // 두 번째 ? : 국어점수 (INTEGER이므로 setInt)
				pstmt.setInt(3, eeng); // 세 번째 ? : 영어점수
				pstmt.setInt(4, emath); // 네 번째 ? : 수학점수
				pstmt.setInt(5, ehist); // 다섯 번째 ? : 역사점수

				// 3. 쿼리 실행 및 결과 확인
				// executeQuery() 대신, 테이블을 변경하는 executeUpdate()를 사용
				int result = pstmt.executeUpdate();

				if (result > 0) {
					System.out.println("학생 성적 정보가 성공적으로 등록되었습니다.");
				} else {
					System.out.println("성적 등록에 실패했습니다.");
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("sql 구문 오류 또는 데이터 제약조건 위반");
		} finally {
			// pstmt 자원 반환 및 커넥션 종료
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
