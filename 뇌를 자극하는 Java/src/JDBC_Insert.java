import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Insert {

	public static void main(String args[]) {

		// 1�ܰ� : DB ������ ���� Ŀ�ؼ� �������̽�
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			String jumincd = null;
			String pname = null;
			String gender = null;
			int age = 0;
			
			// 2�ܰ� : JDBC ����̹��� �ε��Ѵ�
			Class.forName("com.mysql.jdbc.Driver");
			// 3�ܰ� : ����̹� �Ŵ��� Ŭ������ DB�� �����Ѵ�
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "12345");
			System.out.println("�����ͺ��̽��� �����߽��ϴ�.");
			System.out.println("");

			stmt = conn.createStatement();
			
			String sql = "INSERT INTO Person (jumincd, pname, gender, age) VALUES('5803311483948'	,	'�Ӿ��'	,	'f'	,	61);";
			int changeRecord = stmt.executeUpdate(sql);
		
			//int changeRecord = stmt.executeUpdate("UPDATE person SET age = 60 WHERE jumincd = '6008231344964'");

			// 4�ܰ� : DB ������ �����Ѵ�
			conn.close();
			System.out.println(changeRecord +"���� �����Ǿ����ϴ�.");
		} catch (ClassNotFoundException cnfe) {
			System.out.println("�ش� Ŭ������ ã�� �� �����ϴ�." + cnfe.getMessage());
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		}
	}
}