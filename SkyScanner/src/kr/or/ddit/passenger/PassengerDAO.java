package kr.or.ddit.passenger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PassengerDAO {

      public void insertPassenger(PassengerDTO dto) throws Exception {
         Class.forName("oracle.jdbc.driver.OracleDriver");
         Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.45.44", "JHH94", "java");
         Statement statement = connection.createStatement();
         StringBuilder builder = new StringBuilder();
         builder.append(" INSERT INTO PASSENGER ");
         builder.append(" (PA_NAME, PA_REGNO1, PA_REGNO2, PA_HP, PA_EMAIL)");
         builder.append(" VALUES ");
         builder.append(" ('" + dto.getPaName() + "', '" + dto.getPaRegno1() + "', '" + dto.getPaRegno2() + "', '" + dto.getPaHp()  + "', '" + dto.getPaEmail() + "')");
         int result = statement.executeUpdate(builder.toString());
         if (result > 0) {
            System.out.println("등록되었습니다.");
         } else {
            System.out.println("잘못된 정보를 입력하셨습니다.");
         }
         statement.close();
         connection.close();
         
      
   }
      
      public List<PassengerDTO> selectPassengerList() throws Exception {
         Class.forName("oracle.jdbc.driver.OracleDriver"); 
         Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.45.44", "JHH94", "java"); 
         Statement statement = connection.createStatement(); 
         StringBuilder builder = new StringBuilder();
         builder.append("SELECT pa_name, pa_regno1, pa_email, pa_hp");
         builder.append("  FROM Passenger");
         List<PassengerDTO> list = new ArrayList<PassengerDTO>();
         ResultSet resultSet = statement.executeQuery(builder.toString()); 
                                                           
         while (resultSet.next()) {          
            String paName = resultSet.getString("PA_NAME"); 
            String paRegno1 = resultSet.getString("PA_REGNO1");
            String paEmail = resultSet.getString("PA_EMAIL");
            String paHp = resultSet.getString("PA_HP");
            list.add(new PassengerDTO(paName, paRegno1, paEmail, paHp));
         }   
         resultSet.close();
         statement.close();
         connection.close();
         
         return list;
      }
}