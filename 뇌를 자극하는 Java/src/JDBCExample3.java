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
			// 2단계 : JDBC 드라이버를 로드한다
			Class.forName("com.mysql.jdbc.Driver");
			// 3단계 : 드라이버 매니저 클래스는 DB를 연결한다
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "12345");
			System.out.println("데이터베이스에 접속했습니다.");
			System.out.println("");

			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT CustinfoName,	address,	phoneno FROM custinfo");
			
			/*rs = stmt.executeQuery("SELECT jumincd, pname, gender, age
											from person
											WHERE gender = 'm'");
			 */
			System.out.println("	이름                주소                 전화번호    ");

			while (rs.next()) {

				String CustinfoName = rs.getString(1);
				String address = rs.getString(2);
				String phoneno = rs.getString(3);

				System.out.printf("%8s %s %s%n", CustinfoName, address, phoneno);
				
				//System.out.println(CustinfoName + "	" + address + "	" + phoneno);
			}
			conn.close();
		} catch (ClassNotFoundException cnfe) {
			System.out.println("해당 클래스를 찾을 수 없습니다." + cnfe.getMessage());
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		}
	}

}
