//package mem;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.util.Scanner;
//
//import chapter7.EmployeeDTO;
//import mem.MypageDAO;
//
//public class MypageTest {
//	public static void main(String[] args) throws Exception {
//		MypageDAO dao = new MypageDAO();
//		Scanner scanner = new Scanner(System.in);
//
//		// 멤버 수정
//		System.out.println("수정하기");
//		System.out.print("수정할 아이디: ");
//		String memId = scanner.nextLine();
//		System.out.print("수정할 비밀번호: ");
//		String memPass = scanner.nextLine();
//		System.out.print("수정할 이름: ");
//		String memName = scanner.nextLine();
//		System.out.print("수정할 주민번호 앞: ");
//		String memRegno1 = scanner.nextLine();
//		System.out.print("수정할 주민번호 뒤: ");
//		String memRegno2 = scanner.nextLine();
//		System.out.print("수정할 이메일: ");
//		String memEmail = scanner.nextLine();
//		System.out.print("수정할 전화번호: ");
//		String memHp = scanner.nextLine();
//		System.out.print("수정할 도로명: ");
//		String memAdd1 = scanner.nextLine();
//		System.out.print("수정할 상세주소: ");
//		String memAdd2 = scanner.nextLine();
//		System.out.print("기념일: ");
//		String memMemorialDay = scanner.nextLine();
//		dao.updateMem(new MypageDTO(memId, memPass, memName, memRegno1, memRegno2, memEmail, memHp, memAdd1, memAdd2,
//				memMemorialDay));
//
//		// 멤버 삭제
////		System.out.println("삭제하기");
////		System.out.print("삭제할 아이디: ");
////		String id = scanner.nextLine();
////		dao.deleteMem(id);
//
//		// 마일리지 조회
//		System.out.print("조회할 아이디를 입력하세요:");
//		String id1 = scanner.next();
//		dao.selectMem(id1);
//		System.out.println();
//
//		scanner.close();
//	}
//}
