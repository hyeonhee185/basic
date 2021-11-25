package promotion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import promotion.PromotionDTO;
import promotion.PromotionTest;
import oracle.jdbc.driver.OracleDriver;
import project.MemDTO;

public class PromotionDAO {

//	public PromotionDTO selectBirth(String userBirth) throws Exception {
//		Class.forName("oracle.jdbc.driver.OracleDriver");
//		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "JHH94", "java");
//		String sql = "SELECT MEM_NAME FROM MEM WHERE SUBSTR(MEM_MEMORIALDAY,6,2)='05'";
//		PreparedStatement statement = connection.prepareStatement(sql);
//		statement.setString(1, userBirth);
//		ResultSet resultSet = statement.executeQuery();
//		MemDTO vo = null;
//		if (resultSet.next()) {
//			String memId = resultSet.getString("mem_id");
//			String memMileage = resultSet.getString("MEM_MILEAGE");
//			vo = new MemDTO(memId, memMileage);
//		}
//		resultSet.close();
//		statement.close();
//		connection.close();
//
//		return vo;
//	}

}
