
// ��Ű��
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class JDBCExample2 {
	public static void main(String args[]) {
		// 1�ܰ� : DB ������ ���� Ŀ�ؼ� �������̽�
		Connection conn = null;

		// Statement �������̽� - SQL ����
		Statement stmt = null;

		// ResultSet �������̽� - SQL ����� ����
		ResultSet rs = null;

		// try-catch������ DB�����߿� �߻��ϴ����� �˻�
		try {
			String jumincd = null;
			String pname = null;
			String gender = null;

			int age;

			// 2�ܰ� : JDBC ����̹��� �ε��Ѵ�
			Class.forName("com.mysql.jdbc.Driver");
			// 3�ܰ� : ����̹� �Ŵ��� Ŭ������ DB�� �����Ѵ�
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "12345");
			System.out.println("�����ͺ��̽��� �����߽��ϴ�.");
			System.out.println("");

			// Ŀ�ؼ� ��ü�� Statement ��ü�� ����
			stmt = conn.createStatement();

			// DML SQL ���� ���� �� ����� ����
			// rs = stmt.executeQuery("SELECT jumincd, pname, gender, age from person");
			rs = stmt.executeQuery("SELECT jumincd, pname, gender, age " + "from person WHERE gender = 'm'");

			System.out.println("  �ֹι�ȣ        �̸�   ����  ����");

			while (rs.next()) {

				jumincd = rs.getString(1); // rs.getString("jumincd");
				pname = rs.getString(2); // rs.getString("pname");
				gender = rs.getString(3); // rs.getString("gender");
				int age = rs.getInt(4); // rs.getInt("age");

				System.out.println(jumincd + "----" + pname + "----" + gender + "----" + age);
			}
			// 4�ܰ� : DB ������ �����Ѵ�
			conn.close();
		} catch (ClassNotFoundException cnfe) {
			System.out.println("�ش� Ŭ������ ã�� �� �����ϴ�." + cnfe.getMessage());
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		}
	}
}