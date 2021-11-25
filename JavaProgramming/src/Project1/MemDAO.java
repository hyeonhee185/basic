package Project1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import chapter7.EmployeeDTO;

public class MemDAO {
	public void insertMem(MemDTO dto) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "JHH94", "java");
		Statement statement = connection.createStatement();
		StringBuilder builder = new StringBuilder();
		builder.append(" INSERT INTO MEM ");
		builder.append(
				" (MEM_ID, MEM_PASS, MEM_NAME, MEM_REGNO1, MEM_REGNO2, MEM_EMAIL, MEM_HP, MEM_ADD1, MEM_ADD2, MEM_MEMORIALDAY)");
		builder.append(" VALUES ");
		builder.append(" ('" + dto.getMemId() + "', '" + dto.getMemPass() + "', '" + dto.getMemName() + "', '"
				+ dto.getMemRegno1() + "', '" + dto.getMemRegno2() + "', '" + dto.getMemEmail() + "', '"
				+ dto.getMemHp() + "', '" + dto.getMemAdd1() + "', '" + dto.getMemAdd2() + "', '"
				+ dto.getMemMemorialDay() + "')");
		// executeQuery: select
		// executeUpdate: insert, update, delete
		int result = statement.executeUpdate(builder.toString());
		if (result > 0) {
			System.out.println("등록 완료!");
		} else {
			System.out.println("등록 실패!");
		}
		statement.close();
		connection.close();

	}

	public MemDTO selectMileage(String userId) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "JHH94", "java");
		String sql = "select mem_id, mem_mileage from mem where mem_id = ?";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, userId);
		ResultSet resultSet = statement.executeQuery();
		MemDTO vo = null;
		if (resultSet.next()) {
			String memId = resultSet.getString("mem_id");
			String memMileage = resultSet.getString("MEM_MILEAGE");
			vo = new MemDTO(memId, memMileage);
		}
		resultSet.close();
		statement.close();
		connection.close();

		return vo;
	}

	public List<MemDTO> selectMem(MemDTO dto) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "JHH94", "java");
		String sql = "select * from mem where mem_id = ?";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, dto.getMemId());
		ResultSet resultSet = statement.executeQuery();
		List<MemDTO> list = new ArrayList<>();
		while (resultSet.next()) {
			String memId = resultSet.getString("MEM_ID");
			String memPass = resultSet.getString("MEM_PASS");
			String memName = resultSet.getString("MEM_NAME");
			String memRegno1 = resultSet.getString("MEM_REGNO1");
			String memRegno2 = resultSet.getString("MEM_REGNO2");
			String memEmail = resultSet.getString("MEM_EMAIL");
			String memHp = resultSet.getString("MEM_HP");
			String memAdd1 = resultSet.getString("MEM_ADD1");
			String memAdd2 = resultSet.getString("MEM_ADD2");
			String memMemorialDay = resultSet.getString("MEM_MEMORIALDAY");
			list.add(new MemDTO(memId, memPass, memName, memRegno1, memRegno2, memEmail, memHp, memAdd1, memAdd2,
					memMemorialDay));
		}
		resultSet.close();
		statement.close();
		connection.close();

		return list;
	}

//   List<FlightDTO> list = new ArrayList<>();
//         
//   while (resultSet.next()) {
//      String flightId = resultSet.getString("FLIGHT_ID");
//      String depTime = resultSet.getString("DEP_TIME");
//      String arrTime = resultSet.getString("ARR_TIME");
//      String depAirport = resultSet.getString("DEP_AIRPORT");
//      String arrAirport = resultSet.getString("ARR_AIRPORT");
//      String airlineId = resultSet.getString("AIRLINE_ID");
//      String airlineName = resultSet.getString("AIRLINE_NAME");
//      int   price = resultSet.getInt("PRICE");
//      list.add(new FlightDTO(flightId, depTime, arrTime, depAirport, arrAirport, airlineId, airlineName, price));
//   }
//   resultSet.close();
//   statement.close();
//   connection.close();
//   
//   return list;
//}

	public List<MemDTO> selectMemList() throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver"); // JDBC 드라이버 로딩
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "JHH94", "java"); // 데이터베이스
																														// 접속
		Statement statement = connection.createStatement(); // SQL명령 수행하는 statement 객체 생성
		StringBuilder builder = new StringBuilder();
		builder.append("SELECT *");
		builder.append("  FROM MEM");
		List<MemDTO> list = new ArrayList<MemDTO>();
		ResultSet resultSet = statement.executeQuery(builder.toString()); // execteQuery(db에 명령)로 명령하면 ResultSet(명령에 대한
																			// 반환값)이라는 객체를 돌려줌
		// ResultSet : SELECT의 결과를 저장하는 객체
		while (resultSet.next()) { // resultSet.next - 커서의 다음 행이 존재할 경우 true를 리턴
			String memId = resultSet.getString("MEM_ID");
			String memPass = resultSet.getString("MEM_PASS");
			String memName = resultSet.getString("MEM_NAME");
			String memRegno1 = resultSet.getString("MEM_REGNO1");
			String memRegno2 = resultSet.getString("MEM_REGNO2");
			String memEmail = resultSet.getString("MEM_EMAIL");
			String memHp = resultSet.getString("MEM_HP");
			String memAdd1 = resultSet.getString("MEM_ADD1");
			String memAdd2 = resultSet.getString("MEM_ADD2");
			String memMemorialDay = resultSet.getString("MEM_MEMORIALDAY");
			list.add(new MemDTO(memId, memPass, memName, memRegno1, memRegno2, memEmail, memHp, memAdd1, memAdd2,
					memMemorialDay));
		}
		resultSet.close();
		statement.close();
		connection.close();

		return list;
	}

	// 로그인
	public MemDTO selectMemId(String userId) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "JHH94", "java");
		String sql = "select mem_id from mem where mem_id = ?";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, userId);
		ResultSet resultSet = statement.executeQuery();
		MemDTO vo = null;
		if (resultSet.next()) {
			String memId = resultSet.getString("mem_id");
			vo = new MemDTO(memId);
		}
		resultSet.close();
		statement.close();
		connection.close();

		return vo;
	}

}