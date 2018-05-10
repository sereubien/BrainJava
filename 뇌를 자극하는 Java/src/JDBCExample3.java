import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample3 {
	public static void main(String args[]) {

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			// 2�ܰ� : JDBC ����̹��� �ε��Ѵ�
			Class.forName("com.mysql.jdbc.Driver");
			// 3�ܰ� : ����̹� �Ŵ��� Ŭ������ DB�� �����Ѵ�
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "12345");
			System.out.println("�����ͺ��̽��� �����߽��ϴ�.");
			System.out.println("");

			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT CustinfoName,	address,	phoneno FROM custinfo");
			
			/*rs = stmt.executeQuery("SELECT jumincd, pname, gender, age
											from person
											WHERE gender = 'm'");
			 */
			System.out.println("	�̸�                �ּ�                 ��ȭ��ȣ    ");

			while (rs.next()) {

				String CustinfoName = rs.getString(1);
				String address = rs.getString(2);
				String phoneno = rs.getString(3);

				System.out.printf("%8s %s %s%n", CustinfoName, address, phoneno);
				
				//System.out.println(CustinfoName + "	" + address + "	" + phoneno);
			}
			conn.close();
		} catch (ClassNotFoundException cnfe) {
			System.out.println("�ش� Ŭ������ ã�� �� �����ϴ�." + cnfe.getMessage());
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		}
	}

}
