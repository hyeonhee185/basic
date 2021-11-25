//package mem;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.Statement;
//
//
//public class MemDAO {
//   public void insertMem(MemDTO dto) throws Exception {
//      Class.forName("oracle.jdbc.driver.OracleDriver");
//      Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "JHH94", "java");
//      Statement statement = connection.createStatement();
//      StringBuilder builder = new StringBuilder();
//      builder.append(" INSERT INTO MEM ");
//      builder.append(" (MEM_ID, MEM_PASS, MEM_NAME, MEM_REGNO1, MEM_REGNO2, MEM_EMAIL, MEM_HP, MEM_ADD1, MEM_ADD2, MEM_MEMORIALDAY)");
//      builder.append(" VALUES ");
//      builder.append(" ('" + dto.getMemId() + "', '" + dto.getMemPass() + "', '" + dto.getMemName() + "', '" + dto.getMemRegno1()  + "', '" + dto.getMemRegno2()  + "', '" + dto.getMemEmail() + "', '" + dto.getMemHp() + "', '" + dto.getMemAdd1()  + "', '" + dto.getMemAdd2() + "', '" + dto.getMemMemorialDay() + "')");
//      // executeQuery: select
//      // executeUpdate: insert, update, delete
//      int result = statement.executeUpdate(builder.toString());
//      if (result > 0) {
//         System.out.println("등록 완료!");
//      } else {
//         System.out.println("등록 실패!");
//      }
//      statement.close();
//      connection.close();
//      
//   }
//   
//   public MemDTO selectMileage(String userId) throws Exception {
//	      Class.forName("oracle.jdbc.driver.OracleDriver");
//	      Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "HHS96", "java");
//	      String sql = "select mem_id, mem_mileage from mem where mem_id = ?";
//	      PreparedStatement statement = connection.prepareStatement(sql);
//	      statement.setString(1, userId);   
//	      ResultSet resultSet = statement.executeQuery();
//	      MemDTO vo = null;
//	      if (resultSet.next()) {
//	         String memId = resultSet.getString("mem_id");
//	         String memMileage = resultSet.getString("MEM_MILEAGE");
//	         vo = new MemDTO(memId, memMileage);
//	      }
//	      resultSet.close();
//	      statement.close();
//	      connection.close();
//	      
//	      return vo;
//	   }
//
//}