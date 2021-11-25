package chapter7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

//	DAO: Data Access Object
public class LprodDao {
	public List<LprodVO> select() throws Exception {
		// 1. 드라이버 로딩
		Class.forName("oracle.jdbc.driver.OracleDriver");
		// DriverManager.registerDriver(new OracleDriver());

		// 2.DB접속
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "JHH94", "java");

		// 3.질의명령준비
		Statement statement = connection.createStatement();

		// 4.명령실행
		ResultSet resultSet = statement.executeQuery("SELECT LPROD_ID, LPROD_GU, LPROD_NM FROM LPROD");

		// 참고 : insert, update, delete
		// int executeUpdate = statement.executeUpdate("");
		List<LprodVO> vo = new ArrayList<LprodVO>();
		int i = 0;
		while (resultSet.next()) {
			int lprodId = resultSet.getInt("LPROD_ID");
			String lprodGu = resultSet.getString("LPROD_GU");
			String lprodNm = resultSet.getString("LPROD_NM");
			vo.add(new LprodVO(lprodId, lprodGu, lprodNm));
		}
		// 5. 종료(자원반납)
		resultSet.close();
		statement.close();
		connection.close();
		return vo;
	}

	public void insert() {
	}

	public void update() {
	}

	public void delete() {
	}
}
