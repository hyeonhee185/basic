package kr.or.ddit.mem;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class MemController {
	private static MemDAO dao = new MemDAO();
	private static MemController instance = new MemController();

	private MemController() {
	}

	public static MemController getInstance() {
		return instance;
	}

	public static int myPage(Scanner scanner) throws Exception {

		mainLoop: while (true) {
			System.out.println("----------------------------------------------------------------------------------");
			System.out.println("1.회원정보조회\t  2.회원등록\t3.회원수정\t4.회원삭제\t0.마이페이지 종료");
			System.out.println("----------------------------------------------------------------------------------");
			System.out.print("메뉴를 선택하세요: ");
			int menu = scanner.nextInt();
			switch (menu) {
			case 1:
				String memId = null;
				List<MemDTO> list4 = null;
				System.out.println("");
				System.out.println("아이디를 입력하십시오. ");
				System.out.print("회원아이디: ");
				memId = scanner.next();
				System.out.println("");
				list4 = dao.selectMem(new MemDTO(memId));

				if (list4.size() == 0) {
					System.out.println("*저장되지 않은 회원정보입니다.");
				} else {
					System.out.println("------------------------------------------------------");
					System.out.println("아이디  이름   생년월일   이메일     휴대폰번호");
					System.out.println("------------------------------------------------------");
					for (MemDTO vo : list4) {
						System.out.print(vo.getMemId() + "\t");
						System.out.print(vo.getMemName() + "\t");
						System.out.print(vo.getMemRegno1() + "\t");
						System.out.print(vo.getMemEmail() + "\t");
						System.out.print(vo.getMemHp() + "\n");
					}
					System.out.println("------------------------------------------------------");
				}

				break;
			case 2:
				// 회원 등록
				System.out.println("회원 등록하기");
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
					System.out.print("휴대폰 번호(-포함): ");
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

				MemDAO dao1 = new MemDAO();
				dao1.insertMem(new MemDTO(memId, memPass, memName, memRegno1, memRegno2, memEmail, memHp, memAdd1,
						memAdd2, memMemorialDay));
				break;
			case 3:
				// 회원 수정
				MemDAO dao2 = new MemDAO();
				System.out.println("회원 수정하기");

				String memId1 = null;
				while (true) {
					System.out.print("수정할 아이디: ");
					memId1 = scanner.next();
					if (Pattern.matches("^[a-zA-Z0-9]{2,10}+", memId1)) {
						break;
					}
					System.out.println("영어와 숫자로 조합하여 2글자 이상 10글자 이하 비밀번호");
				}

				String memPass1 = null;
				while (true) {
					System.out.print("비밀번호: ");
					memPass1 = scanner.next();
					if (Pattern.matches("^[a-zA-Z0-9]{2,10}", memPass1)) {
						break;
					}
					System.out.println("영어와 숫자로 조합하여 2글자 이상 10글자 이하 비밀번호");
				}

				String memName1 = null;
				while (true) {
					System.out.print("수정할 이름: ");
					memName1 = scanner.next();
					if (Pattern.matches("[가-힣]{2,10}+", memName1)) {
						break;
					}
					System.out.println("한글 이름을 두글자 이상 입력해주세요");
				}

				String memRegno11 = null;
				while (true) {
					System.out.print("주민번호 앞자리: ");
					memRegno11 = scanner.next();
					if (Pattern.matches("[0-9]{6}", memRegno11)) {
						break;
					}
					System.out.println("주민등록번호 앞 6자리를 입력해주세요");
				}

				String memRegno21 = null;
				while (true) {
					System.out.print("주민번호 뒷자리: ");
					memRegno21 = scanner.next();
					if (Pattern.matches("[1-4]\\d{6}", memRegno21)) {
						break;
					}
					System.out.println("주민등록번호 뒤 7자리를 입력해주세요");
				}

				String memEmail1 = null;
				while (true) {
					System.out.print("이메일: ");
					memEmail1 = scanner.next();
					if (Pattern.matches("[a-zA-Z0-9]+@[a-zA-Z0-9]+.[a-zA-Z]+", memEmail1)) {
						break;
					}
					System.out.println("올바른 이메일 형식을 입력하세요");
				}

				String memHp1 = null;
				while (true) {
					System.out.print("휴대폰 번호(-포함): ");
					memHp1 = scanner.next();
					if (Pattern.matches("\\d{3}-\\d{3,4}-\\d{4}", memHp1)) {
						break;
					}
					System.out.println("올바른 휴대전화 번호를 입력하세요.");
				}

				System.out.print("수정할 도로명: ");
				String memAdd11 = scanner.next();
				System.out.print("수정할 상세주소: ");
				String memAdd21 = scanner.next();

				String memMemorialDay1 = null;
				while (true) {
					System.out.print("수정할 기념일(YYYY/MM/DD): ");
					memMemorialDay1 = scanner.next();
					if (Pattern.matches("[0-9]{4}/[0-1]{1}[0-9]{1}/[0-3]{1}[0-9]{1}", memMemorialDay1)) {
						break;
					}
					System.out.println("(YYYY/MM/DD)형식으로 날짜를 입력하세요");
				}

				dao2.updateMem(new MemDTO(memId1, memPass1, memName1, memRegno11, memRegno21, memEmail1, memHp1,
						memAdd11, memAdd21, memMemorialDay1));
				break;

			case 4:
				// 회원 삭제
				MemDAO dao3 = new MemDAO();
				System.out.println("삭제하기");
				System.out.print("삭제할 아이디: ");
				String id = scanner.next();
				dao3.deleteMem(id);
				break;
			case 0:
				// 프로그램 종료

				break mainLoop;
			}
			System.out.println();
		}
		return 3;
	}

}
