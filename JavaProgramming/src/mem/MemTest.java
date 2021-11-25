//package mem;
//
//import java.util.InputMismatchException;
//import java.util.Scanner;
//
//import mem.MemDAO;
//import mem.MemDTO;
//
//public class MemTest {
//	public static void main(String[] args) throws Exception {
//		MemDAO dao = new MemDAO();
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("등록하기");
//
//		System.out.print("아이디: ");
//		String memId = scanner.next();
//
//		System.out.print("비밀번호: ");
//		String memPass = scanner.next();
//		System.out.print("이름: ");
//		String memName = scanner.next();
//		try {
//		System.out.print("주민번호 앞자리: ");
//		String memRegno1 = scanner.next();
//		}catch(InputMismatchException e){
//			System.out.println("숫자로만 입력");
//		}
//		System.out.print("주민번호 뒷자리: ");
//		String memRegno2 = scanner.next();
//		System.out.print("이메일: ");
//		String memEmail = scanner.next();
//		System.out.print("휴대폰 번호: ");
//		String memHp = scanner.next();
//		System.out.print("도로명 주소: ");
//		String memAdd1 = scanner.next();
//		System.out.print("상세주소: ");
//		String memAdd2 = scanner.next();
//		System.out.print("기념일: ");
//		String memMemorialDay = scanner.next();
//
//		dao.insertMem(new MemDTO(memId, memPass, memName, memRegno1, memRegno2, memEmail, memHp, memAdd1, memAdd2,
//				memMemorialDay));
//	}
//}