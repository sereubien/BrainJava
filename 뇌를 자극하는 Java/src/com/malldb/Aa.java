package com.malldb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
// import java.sql.*;

class Aa {

	public static void main(String args[]) {
		// 1단계 : DB 연결을 위한 커넥션 인터페이스
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		// try-catch문에서 DB연결중에 발생하는지를 검사
		try {
			// 2단계 : JDBC 드라이버를 로드한다
			Class.forName("com.mysql.jdbc.Driver");
			// 3단계 : 드라이버 매니저 클래스는 DB를 연결한다
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/malldb", "root", "12345");
			System.out.println("데이터베이스에 접속했습니다.");

			// malldb 접속 정보
			// SHOW PROCESSLIST;
			// SELECT NOW();

			stmt = conn.createStatement();

			String sql = ("INSERT INTO custinfo1 (CustinfoName, address, phoneno)\r\n"
					+ "values(	'김재영'	,	'서울시 서초구 FFF동 222-777호'	,	'02-540-0000'	)");
			int changeRecord = stmt.executeUpdate(sql);

			rs = stmt.executeQuery("SELECT * FROM custinfo1");

			while (rs.next()) {
				System.out.print(rs.getString(1) + "	");
				System.out.print(rs.getString(2) + "	");
				System.out.println(rs.getString(3));
			}

			// 4단계 : DB 연결을 종료한다
			conn.close();
			System.out.println(changeRecord + "건이 삽입되었습니다.");

		} catch (ClassNotFoundException cnfe) {
			System.out.println("해당 클래스를 찾을 수 없습니다." + cnfe.getMessage());
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		}
	}
}