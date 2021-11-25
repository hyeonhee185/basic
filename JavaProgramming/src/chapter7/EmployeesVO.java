package chapter7;

public class EmployeesVO {
	private int departmentId;
	private String departmentName;
	private String employeeId;
	private String empName;
	public EmployeesVO(int departmentId, String departmentName, String employeeId, String empName) {
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.employeeId = employeeId;
		this.empName = empName;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EmployeesVO [departmentId=");
		builder.append(departmentId);
		builder.append(", departmentName=");
		builder.append(departmentName);
		builder.append(", employeeId=");
		builder.append(employeeId);
		builder.append(", empName=");
		builder.append(empName);
		builder.append("]");
		return builder.toString();
	}

	
}
