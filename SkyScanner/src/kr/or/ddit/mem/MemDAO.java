package kr.or.ddit.mem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import kr.or.ddit.mem.MemDTO;


public class MemDAO {   
   
      // 마일리지 조회
      public MemDTO selectMileage(String userId) throws Exception {
         Class.forName("oracle.jdbc.driver.OracleDriver");
         Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.45.44", "JHH94", "java");
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
         Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.45.44", "JHH94", "java");
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
            System.out.println("회원가입이 완료되었습니다.");
         } else {
            System.out.println("회원가입에 실패하였습니다.");
         }
         statement.close();
         connection.close();
      }
   
      // 회원 수정
      public void updateMem(MemDTO dto) throws Exception {
         Class.forName("oracle.jdbc.driver.OracleDriver");
         Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.45.44", "JHH94", "java");
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
            System.out.println("회원 정보가 수정되었습니다.");
         } else {
            System.out.println("잘못된 정보를 입력하셨습니다.");
         }
         statement.close();
         connection.close();
      }
   
      // 회원 탈퇴
      public void deleteMem(String memId) throws Exception {
         Class.forName("oracle.jdbc.driver.OracleDriver");
         Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.45.44", "JHH94", "java");
         String sql = "delete from mem where mem_id = ?";
         PreparedStatement statement = connection.prepareStatement(sql);
         statement.setString(1, memId);
         // statement 실행
         int result = statement.executeUpdate();
         if (result > 0) {
            System.out.println("회원 정보가 삭제되었습니다.");
         } else {
            System.out.println("잘못된 정보를 입력하셨습니다.");
         }
         statement.close();
         connection.close();   
   }

   
   public List<MemDTO> selectMem(MemDTO dto) throws Exception {
      Class.forName("oracle.jdbc.driver.OracleDriver");
      Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.45.44", "JHH94", "java");
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
         list.add(new MemDTO(memId, memPass, memName, memRegno1, memRegno2, memEmail, memHp, memAdd1, memAdd2, memMemorialDay));
      }
      resultSet.close();
      statement.close();
      connection.close();
      
      return list;
   }
}
