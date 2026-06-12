package com.hjh;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.hjh.conn.DBConnection2;

public class VaccineMain {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = DBConnection2.getConnection();
			System.out.println("hrd 연결 성공");

			if (conn != null) {
				// 1. 가공 없는 순수 JOIN SQL문 작성 (?로 예약번호를 받음)
				String sql = "SELECT r.RESVNO, j.NAME, j.JUMIN, h.HOSPNAME, r.RESVDATE, r.RESVTIME, r.VCODE, h.HOSPADDR "
						+ "FROM va_vacc_resv r " + "JOIN va_jumin j ON r.JUMIN = j.JUMIN "
						+ "JOIN va_hosp h ON r.HOSPCODE = h.HOSPCODE " + "WHERE r.RESVNO = ?";

				pstmt = conn.prepareStatement(sql);

				// 2. 파라미터 셋팅 (예시로 예약번호 20210001번 조회)
				pstmt.setInt(1, 20210001);

				rs = pstmt.executeQuery();

				System.out.println(
						"==========================================================================================");
				System.out.println("예약번호\t성명\t성별\t병원이름\t예약날짜\t\t예약시간\t백신명\t병원지역");
				System.out.println(
						"==========================================================================================");

				if (rs.next()) {
					int resvNo = rs.getInt("RESVNO");
					String name = rs.getString("NAME");
					String jumin = rs.getString("JUMIN");
					String hospName = rs.getString("HOSPNAME");
					Date resvDate = rs.getDate("RESVDATE");
					String resvTime = rs.getString("RESVTIME");
					String vCode = rs.getString("VCODE");
					String hospAddr = rs.getString("HOSPADDR");

					// [가공 1] 주민번호 기반 성별 도출 (하이픈 포함된 710101-1000001 형태 기준 8번째 글자 추출)
					String gender = "알수없음";
					if (jumin != null && jumin.length() >= 8) {
						char genderChar = jumin.charAt(7); // 0부터 시작하므로 7번째가 하이픈(-) 뒷자리
						if (genderChar == '1' || genderChar == '3') {
							gender = "남";
						} else if (genderChar == '2' || genderChar == '4') {
							gender = "여";
						}
					}

					// [가공 2] 예약날짜 포맷팅 (yyyy년MM월dd일)
					String formattedDate = "";
					if (resvDate != null) {
						SimpleDateFormat sdf = new SimpleDateFormat("yyyy년MM월dd일");
						formattedDate = sdf.format(resvDate);
					}

					// [가공 3] 예약시간 포맷팅 (0930 -> 09:30)
					String formattedTime = "";
					if (resvTime != null && resvTime.length() == 4) {
						formattedTime = resvTime.substring(0, 2) + ":" + resvTime.substring(2, 4);
					} else {
						formattedTime = resvTime;
					}

					// [가공 4] 백신코드 값에 따라 백신명 표현
					String vName = "";
					if (vCode != null) {
						switch (vCode.trim()) {
						case "V001":
							vName = "A백신";
							break;
						case "V002":
							vName = "B백신";
							break;
						case "V003":
							vName = "C백신";
							break;
						default:
							vName = "기타백신";
							break;
						}
					}

					// [가공 5] 지역코드 값에 따라 병원지역 구분
					String cityName = "";
					if (hospAddr != null) {
						switch (hospAddr.trim()) {
						case "10":
							cityName = "서울";
							break;
						case "20":
							cityName = "경기";
							break;
						case "30":
							cityName = "인천";
							break;
						case "40":
							cityName = "강원";
							break;
						default:
							cityName = "기타";
							break;
						}
					}

					// 결과 출력
					System.out.println(resvNo + "\t" + name + "\t" + gender + "\t" + hospName + "\t" + formattedDate
							+ "\t" + formattedTime + "\t" + vName + "\t" + cityName);
				} else {
					System.out.println("해당 예약번호의 데이터가 존재하지 않습니다.");
				}
				System.out.println(
						"==========================================================================================");
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
