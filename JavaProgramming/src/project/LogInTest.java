package project;

import java.util.Scanner;
import java.util.regex.Pattern;

//import bookstore.common.HomeMenu;
//import bookstore.join.CustomerVO;
import project.LogInDAO;
import project.LogInDTO;

public class LogInTest {
	private static LogInDAO dao = new LogInDAO();

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		LogInTest main = new LogInTest();
		mainLoop: while (true) {
			System.out.println("------------------------------------");
			System.out.println("1.로그인\t2.회원가입");
			System.out.println("------------------------------------");
			System.out.print("메뉴를 선택하세요: ");
			int login = scanner.nextInt();
			switch (login) {
			case 1:
				try {
					System.out.print("아이디를 입력하세요: ");
					String userId = scanner.next();
					System.out.print("비밀번호를 입력하세요: ");
					String userPass = scanner.next();
					MemDTO vo = dao.selectMemId(userId, userPass);
					vo.getMemId();
//					System.out.print(vo.getMemId() + "\t");
					System.out.println("로그인 성공");
				} catch (NullPointerException e) {
					System.out.println("아이디나 비밀번호를 확인하세요");
				}
				break;
			case 2:
				try {
					MemDAO dao1 = new MemDAO();
					System.out.println("회원가입");

					String memId = null;
					while (true) {
						System.out.print("아이디: ");
						memId = scanner.next();
						if (Pattern.matches("[a-zA-Z]{2,10}[0-9]{1,10}+", memId)) {
							break;
						}
						System.out.println("아이디 영문자 2글자 이상+숫자 1글자 이상 조합으로 입력 ex)hyeon2");
					}
					System.out.print("비밀번호: ");
					String memPass = scanner.next();

					String memName = null;
					while (true) {
						System.out.print("이름: ");
						memName = scanner.next();
						if (Pattern.matches("[가-힣]{2,10}+", memName)) {
							break;
						}
						System.out.println("한글 이름을 두글자 이상 입력해주세요");
					}

					String memRegno1 = null;
					while (true) {
						System.out.print("주민번호 앞자리: ");
						memRegno1 = scanner.next();
						if (Pattern.matches("[0-9]{6}", memRegno1)) {
							break;
						}
						System.out.println("주민등록번호 앞 6자리를 입력해주세요");
					}

					String memRegno2 = null;
					while (true) {
						System.out.print("주민번호 뒷자리: ");
						memRegno2 = scanner.next();
						if (Pattern.matches("[1-4]\\d{6}", memRegno2)) {
							break;
						}
						System.out.println("주민등록번호 뒤 7자리를 입력해주세요");
					}

					String memEmail = null;
					while (true) {
						System.out.print("이메일: ");
						memEmail = scanner.next();
						if (Pattern.matches("[a-zA-Z0-9]+@[a-zA-Z0-9]+.[a-zA-Z]+", memEmail)) {
							break;
						}
						System.out.println("올바른 이메일 형식을 입력하세요");
					}

					String memHp = null;
					while (true) {
						System.out.print("휴대폰 번호: ");
						memHp = scanner.next();
						if (Pattern.matches("\\d{3}-\\d{3,4}-\\d{4}", memHp)) {
							break;
						}
						System.out.println("올바른 휴대전화 번호를 입력하세요.");
					}
					System.out.print("도로명 주소: ");
					String memAdd1 = scanner.next();
					System.out.print("상세주소: ");
					String memAdd2 = scanner.next();

					String memMemorialDay = null;
					while (true) {
						System.out.print("기념일(YYYY/MM/DD): ");
						memMemorialDay = scanner.next();
						if (Pattern.matches("[0-9]{4}/[0-1]{1}[0-9]{1}/[0-3]{1}[0-9]{1}", memMemorialDay)) {
							break;
						}
						System.out.println("(YYYY/MM/DD)형식으로 날짜를 입력하세요");
					}

					dao1.insertMem(new MemDTO(memId, memPass, memName, memRegno1, memRegno2, memEmail, memHp, memAdd1,
							memAdd2, memMemorialDay));

				} catch (Exception e) {
					System.out.println("잘못된 정보를 입력하였습니다.");
				}
				break;
			}
//			scanner.close();
		}

	}

}
