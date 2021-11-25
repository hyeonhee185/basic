package project;

import java.util.Scanner;

import chapter7.EmployeeDTO;
import chapter7.EmployeesVO;

public class EmployeeTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("등록하기");
		System.out.print("아이디: ");
		String id = scanner.next();
		System.out.print("이름: ");
		String name = scanner.next();
		System.out.print("이메일: ");
		String email = scanner.next();
		System.out.println("휴대전화번호: ");
		String hpNumber = scanner.next();
		dao.insertEmployee(new EmployeeDTO(id, name, email, hpNumber))
	}
}
