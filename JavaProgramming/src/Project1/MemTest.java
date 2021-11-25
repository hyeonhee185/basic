package Project1;

import java.util.List;
import java.util.Scanner;

public class MemTest {
	public static void main(String[] args) throws Exception {
		MemDAO dao = new MemDAO();
		Scanner scanner = new Scanner(System.in);
		// 회원 등록
//      System.out.println("등록하기");
//      System.out.print("아이디: ");
//      String memId = scanner.next();
//      System.out.print("비밀번호: ");
//      String memPass = scanner.next();
//      System.out.print("이름: ");
//      String memName = scanner.next();
//      System.out.print("주민번호 앞자리: ");
//      String memRegno1 = scanner.next();
//      System.out.print("주민번호 뒷자리: ");
//      String memRegno2 = scanner.next();
//      System.out.print("이메일: ");
//      String memEmail = scanner.next();
//      System.out.print("휴대폰 번호: ");
//      String memHp = scanner.next();
//      System.out.print("도로명 주소: ");
//      String memAdd1 = scanner.next();
//      System.out.print("상세주소: ");
//      String memAdd2 = scanner.next();
//      System.out.print("기념일: ");
//      String memMemorialDay = scanner.next();
//         
//      dao.insertMem(new MemDTO(memId,memPass, memName, memRegno1, memRegno2, memEmail,
//             memHp, memAdd1, memAdd2, memMemorialDay));

//      //회원 조회
//      System.out.print("조회할 아이디를 입력하세요: ");
//      String memId = scanner.nextLine();
//      List<MemDTO> list2 = dao.selectMem(new MemDTO(memId));
//      for (MemDTO vo : list2) {
//      System.out.print(vo.getMemId() + "\t");
//      System.out.print(vo.getMemPass() + "\t");
//      System.out.print(vo.getMemName() + "\t");
//      System.out.print(vo.getMemRegno1() + "\t");
//      System.out.print(vo.getMemRegno2() + "\t");
//      System.out.print(vo.getMemEmail() + "\t");
//      System.out.print(vo.getMemHp() + "\t");
//      System.out.print(vo.getMemAdd1() + "\t");
//      System.out.print(vo.getMemAdd2() + "\t");
//      System.out.print(vo.getMemMemorialDay() + "\n");
//      }
//   

		// 회원 조회
//      List<MemDTO> list = dao.selectMemList();
//      for (MemDTO vo : list) {
//         System.out.print(vo.getMemId() + "\t");
//         System.out.print(vo.getMemPass() + "\t");
//         System.out.print(vo.getMemName() + "\t");
//         System.out.print(vo.getMemRegno1() + "\t");
//         System.out.print(vo.getMemRegno2() + "\t");
//         System.out.print(vo.getMemEmail() + "\t");
//         System.out.print(vo.getMemHp() + "\t");
//         System.out.print(vo.getMemAdd1() + "\t");
//         System.out.print(vo.getMemAdd2() + "\t");
//         System.out.print(vo.getMemMemorialDay() + "\n");
//      }
		try {
			System.out.print("아이디를 입력하세요: ");
			String userId = scanner.nextLine();
			MemDTO vo = dao.selectMemId(userId);
			System.out.print(vo.getMemId() + "\t");
			scanner.close();
		} catch (java.lang.NullPointerException e) {
			System.out.println("잘못된 아이디를 입력하셨습니다.");
		}
	}
}