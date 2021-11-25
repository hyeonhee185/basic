package project;

import java.sql.DriverManager;
import java.sql.SQLException;

import chapter7.EmployeesVO;

public class EmployeeDAO {

	public EmployeesVO selectEmployee(String employeeId) throws Exception {
		DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "JHH94", "java");
		StringBuilder builder = new StringBuilder();
		
	}

	
}
