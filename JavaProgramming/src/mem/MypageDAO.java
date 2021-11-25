//package mem;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.Statement;
//import java.util.ArrayList;
//import java.util.List;
//
//import chapter7.EmployeeDTO;
//import mem.MypageDTO;
//
//public class MypageDAO {
//	public void deleteMem(String memId) throws Exception {
//		Class.forName("oracle.jdbc.driver.OracleDriver");
//		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "JHH94", "java");
//		String sql = "delete from mem where mem_id = ?";
//		PreparedStatement statement = connection.prepareStatement(sql);
//		statement.setString(1, memId);
//		// statement 실행
//		int result = statement.executeUpdate();
//		if (result > 0) {
//			System.out.println("삭제 성공!");
//		} else {
//			System.out.println("삭제 실패! 삭제할 아이디가 없습니다");
//		}
//		statement.close();
//		connection.close();
//	}
//
//	public void updateMem(MypageDTO mypageDTO) throws Exception {
//		Class.forName("oracle.jdbc.driver.OracleDriver");
//		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "JHH94", "java");
//		String sql = "update mem set mem_Pass = ?, mem_Name = ?, mem_Regno1 = ?, mem_Regno2 = ?, mem_Email= ?, mem_Hp= ?, mem_Add1= ?,mem_Add2 = ?, mem_MemorialDay = ? where mem_id = ?";
//		PreparedStatement statement = connection.prepareStatement(sql);
//		statement.setString(1, mypageDTO.getMemPass());
//		statement.setString(2, mypageDTO.getMemName());
//		statement.setString(3, mypageDTO.getMemRegno1());
//		statement.setString(4, mypageDTO.getMemRegno2());
//		statement.setString(5, mypageDTO.getMemEmail());
//		statement.setString(6, mypageDTO.getMemHp());
//		statement.setString(7, mypageDTO.getMemAdd1());
//		statement.setString(8, mypageDTO.getMemAdd2());
//		statement.setString(9, mypageDTO.getMemMemorialDay());
//		statement.setString(10, mypageDTO.getMemId());
//
//		// statement 실행
//		int result = statement.executeUpdate();
//		if (result > 0) {
//			System.out.println("변경 성공!");
//		} else {
//			System.out.println("변경 실패!");
//		}
//		statement.close();
//		connection.close();
//	}
//
//
//	public MypageDTO selectMem(String memId) throws Exception {
//		Class.forName("oracle.jdbc.driver.OracleDriver");
//		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "JHH94", "java");
//		StringBuilder builder = new StringBuilder();
//		builder.append("SELECT MEM_MILEAGE FROM MEM WHERE MEM_ID  = ?");
//		PreparedStatement statement = connection.prepareStatement(builder.toString());
//		statement.setString(1, memId);
//		ResultSet resultSet = statement.executeQuery();
//		MypageDTO vo = null;
//		if (resultSet.next()) {
//			String memId2 = resultSet.getString("MEM_ID");
//			String memMileage = resultSet.getString("MEM_MILEAGE");
//			vo = new MypageDTO(memId, memMileage);
//		}
//		resultSet.close();
//		statement.close();
//		connection.close();
//		return vo;
//	}
//
//}
