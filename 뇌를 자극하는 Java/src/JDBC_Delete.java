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

		// 1단계 : DB 연결을 위한 커넥션 인터페이스
		Connection conn = null;
		Statement stmt = null;

		// try ~ catch 문에서 DB연결중에 예외가 발생하는지를 검사.
		try {
			// 2단계 : JDBC 드라이버를 로드한다
			Class.forName("com.mysql.jdbc.Driver");
			// 3단계 : 드라이버 매니저 클래스는 DB를 연결한다
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "12345");
			System.out.println("데이터베이스에 접속했습니다.");
			System.out.println("");

			stmt = conn.createStatement();

			String sql = "DELETE FROM person WHERE pname = '" + args[0] + "'"; // 홍길동
			// DELETE FROM person WHERE pname = '홍길동';
			int changeRecord = stmt.executeUpdate(sql);

			// int changeRecord = stmt.executeUpdate("UPDATE person SET age = 60 WHERE
			// jumincd = '6008231344964'");

			// 4단계 : DB 연결을 종료한다
			conn.close();
			if (changeRecord > 0)
				System.out.println(changeRecord + "건이 삭제되었습니다.");
			else
				System.out.println("삭제된 데이터가 없습니다.");
		} catch (ClassNotFoundException cnfe) {
			System.out.println("해당 클래스를 찾을 수 없습니다." + cnfe.getMessage());
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		}
	}
}