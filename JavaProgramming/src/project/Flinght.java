package project;

public class Flinght {

	System.out.print("조회할 아이디를 입력하세요: ");
    String userId = scanner.nextLine();
    System.out.println(dao.selectMileage(userId));
    MemDTO vo = dao.selectMileage(userId);
    System.out.print(vo.getMemId() + "\t");
    System.out.print(vo.getMemMileage() + "\t");
    scanner.close();
    
    
    public MemDTO selectMileage(String userId) throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "HHS96", "java");
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
     
}
