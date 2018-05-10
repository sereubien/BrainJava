/** 2018. 5. 9. Dev By JAY
 * 
 * JDBC_Delete.java
 */

/**
 * @author kosea_1class_22
 *
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Delete {

	public static void main(String args[]) {

		// 1�ܰ� : DB ������ ���� Ŀ�ؼ� �������̽�
		Connection conn = null;
		Statement stmt = null;

		// try ~ catch ������ DB�����߿� ���ܰ� �߻��ϴ����� �˻�.
		try {
			// 2�ܰ� : JDBC ����̹��� �ε��Ѵ�
			Class.forName("com.mysql.jdbc.Driver");
			// 3�ܰ� : ����̹� �Ŵ��� Ŭ������ DB�� �����Ѵ�
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "12345");
			System.out.println("�����ͺ��̽��� �����߽��ϴ�.");
			System.out.println("");

			stmt = conn.createStatement();

			String sql = "DELETE FROM person WHERE pname = '" + args[0] + "'"; // ȫ�浿
			// DELETE FROM person WHERE pname = 'ȫ�浿';
			int changeRecord = stmt.executeUpdate(sql);

			// int changeRecord = stmt.executeUpdate("UPDATE person SET age = 60 WHERE
			// jumincd = '6008231344964'");

			// 4�ܰ� : DB ������ �����Ѵ�
			conn.close();
			if (changeRecord > 0)
				System.out.println(changeRecord + "���� �����Ǿ����ϴ�.");
			else
				System.out.println("������ �����Ͱ� �����ϴ�.");
		} catch (ClassNotFoundException cnfe) {
			System.out.println("�ش� Ŭ������ ã�� �� �����ϴ�." + cnfe.getMessage());
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		}
	}
}