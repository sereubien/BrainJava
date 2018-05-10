package com.malldb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
// import java.sql.*;

class Aa {

	public static void main(String args[]) {
		// 1�ܰ� : DB ������ ���� Ŀ�ؼ� �������̽�
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		// try-catch������ DB�����߿� �߻��ϴ����� �˻�
		try {
			// 2�ܰ� : JDBC ����̹��� �ε��Ѵ�
			Class.forName("com.mysql.jdbc.Driver");
			// 3�ܰ� : ����̹� �Ŵ��� Ŭ������ DB�� �����Ѵ�
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/malldb", "root", "12345");
			System.out.println("�����ͺ��̽��� �����߽��ϴ�.");

			// malldb ���� ����
			// SHOW PROCESSLIST;
			// SELECT NOW();

			stmt = conn.createStatement();

			String sql = ("INSERT INTO custinfo1 (CustinfoName, address, phoneno)\r\n"
					+ "values(	'���翵'	,	'����� ���ʱ� FFF�� 222-777ȣ'	,	'02-540-0000'	)");
			int changeRecord = stmt.executeUpdate(sql);

			rs = stmt.executeQuery("SELECT * FROM custinfo1");

			while (rs.next()) {
				System.out.print(rs.getString(1) + "	");
				System.out.print(rs.getString(2) + "	");
				System.out.println(rs.getString(3));
			}

			// 4�ܰ� : DB ������ �����Ѵ�
			conn.close();
			System.out.println(changeRecord + "���� ���ԵǾ����ϴ�.");

		} catch (ClassNotFoundException cnfe) {
			System.out.println("�ش� Ŭ������ ã�� �� �����ϴ�." + cnfe.getMessage());
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		}
	}
}