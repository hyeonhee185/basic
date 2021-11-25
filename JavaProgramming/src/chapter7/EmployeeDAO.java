package chapter7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import oracle.jdbc.driver.OracleDriver;

public class EmployeeDAO {
	public List<EmployeeDTO> selectEmployeeList() throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost/xe", "JHH94", "java");
		Statement statement = connection.createStatement();
		StringBuilder builder = new StringBuilder();
		builder.append("SELECT ID, HP_NUMBER, NAME, EMAIL");
		builder.append("  FROM EMPLOYEE");
		List<EmployeeDTO> list = new ArrayList<EmployeeDTO>();
		ResultSet resultSet = statement.executeQuery(builder.toString());
		while (resultSet.next()) {
			String id = resultSet.getString("ID");
			String hp_number = resultSet.getString("HP_NUMBER");
			String name = resultSet.getString("NAME");
			String email = resultSet.getString("EMAIL");
			list.add(new EmployeeDTO(id, hp_number, name, email));
		}
		resultSet.close();
		statement.close();
		connection.close();

		return list;
	}

	public EmployeeDTO selectEmployee(String userId) throws Exception {

		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "JHH94", "java");
		StringBuilder builder = new StringBuilder();
		builder.append("SELECT IDM HP_NUMBER, NAME, EMAIL, FROM EMPLOYEE WHERE ID = ?");
		PreparedStatement statement = connection.prepareStatement(builder.toString());
		statement.setString(1, userId);
		ResultSet resultSet = statement.executeQuery();
		EmployeeDTO vo = null;
		if (resultSet.next()) {
			String id = resultSet.getString("ID");
			String hp_number = resultSet.getString("HP_NUMBER");
			String name = resultSet.getString("NAME");
			String email = resultSet.getString("EMAIL");
			vo = new EmployeeDTO(id, hp_number, name, email);
		}

		statement.close();
		connection.close();
		return vo;
	}

	public void insertEmployee(EmployeeDTO dto) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "JHH94", "java");
		Statement statement = connection.createStatement();
		StringBuilder builder = new StringBuilder();
		builder.append("INSERT INTO EMPLOYEE ");
		builder.append("(ID, HP_NUMBER, NAME, EMAIL)");
		builder.append("VALUES ");

		builder.append(
				"('" + dto.getId() + "','" + dto.getHpNumber() + "','" + dto.getName() + "','" + dto.getEmail() + "')");
		int result = statement.executeUpdate(builder.toString());
		if (result > 0) {
			System.out.println("정상 등록!");
		} else {
			System.out.println("등록 실패!");
		}

		statement.close();
		connection.close();

	}

	// 업데이트
	public void updateEmployee(EmployeeDTO dto) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "JHH94", "java");
		String sql = "update employee set name = ?, email = ?, hp_number = ? where id = ?";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, dto.getName()); // setString()은 알아서 작은따옴표('')를 붙여준다
		statement.setString(2, dto.getEmail()); // setInt()는 작은따옴표가 붙지 않는다
		statement.setString(3, dto.getHpNumber());
		statement.setString(4, dto.getId());
		// statement 실행
		int result = statement.executeUpdate();
		if (result > 0) {
			System.out.println("변경 성공!");
		} else {
			System.out.println("변경 실패!");
		}
		statement.close();
		connection.close();
	}

	public void deleteEmployee(String id) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "JHH94", "java");
		String sql = "delete from employee where id = ?";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, id);
		// statement 실행
		int result = statement.executeUpdate();
		if (result > 0) {
			System.out.println("삭제 성공!");
		} else {
			System.out.println("삭제 실패! 삭제할 아이디가 없습니다");
		}
		statement.close();
		connection.close();

	}
}
