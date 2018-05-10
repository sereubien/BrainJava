/**
 * 2018. 5. 10. Dev By JAY

 * com.malldb
 * JDBCExample.java
 */
package com.malldb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class JDBCExample {
	
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

			rs = stmt.executeQuery("SELECT NOW()");

			if (rs.next())
				System.out.println(rs.getString(1));
			else
				System.out.println("��µ� ���ڵ尡 �����ϴ�.");

			// 4�ܰ� : DB ������ �����Ѵ�
			conn.close();
		} catch (ClassNotFoundException cnfe) {
			System.out.println("�ش� Ŭ������ ã�� �� �����ϴ�." + cnfe.getMessage());
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		}
	}
}
