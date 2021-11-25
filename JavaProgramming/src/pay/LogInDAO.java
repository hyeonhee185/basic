package pay;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import project.MemDTO;
import project.MemDTO;
import oracle.jdbc.driver.OracleDriver;

public class LogInDAO {

	// 마일리지 조회
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

	// 회원 가입
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
		int result = statement.executeUpdate(builder.toString());
		if (result > 0) {
			System.out.println("등록 완료!");
		} else {
			System.out.println("등록 실패!");
		}
		statement.close();
		connection.close();
	}

	// 회원 수정
	public void updateMem(MemDTO dto) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "JHH94", "java");
		String sql = "update mem set mem_Pass = ?, mem_Name = ?, mem_Regno1 = ?, mem_Regno2 = ?, mem_Email= ?, mem_Hp= ?, mem_Add1= ?,mem_Add2 = ?, mem_MemorialDay = ? where mem_id = ?";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, dto.getMemPass());
		statement.setString(2, dto.getMemName());
		statement.setString(3, dto.getMemRegno1());
		statement.setString(4, dto.getMemRegno2());
		statement.setString(5, dto.getMemEmail());
		statement.setString(6, dto.getMemHp());
		statement.setString(7, dto.getMemAdd1());
		statement.setString(8, dto.getMemAdd2());
		statement.setString(9, dto.getMemMemorialDay());
		statement.setString(10, dto.getMemId());

		int result = statement.executeUpdate();
		if (result > 0) {
			System.out.println("변경 성공!");
		} else {
			System.out.println("변경 실패!");
		}
		statement.close();
		connection.close();
	}

	// 회원 탈퇴
	public void deleteMem(String memId) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "JHH94", "java");
		String sql = "delete from mem where mem_id = ?";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, memId);
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
