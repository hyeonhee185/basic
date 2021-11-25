package mvc.controller;

import java.util.List;
import java.util.Scanner;

import mvc.service.IMemberService;
import mvc.service.MemberServiceImpl;
import mvc.vo.MemberVO;

public class MemberController {
	private Scanner scan = new Scanner(System.in);
	private IMemberService service;

	public MemberController() {
		// service 사용을 위한 생성자
		service = new MemberServiceImpl();
	}

	public static void main(String[] args) {
		new MemberController().memberStart();
	}

	// 메뉴를 출력하고 실행할 작업번호를 입력하시오
	private int displayMenu() {
		System.out.println("    -- 작업 선택 --");
		System.out.println("    1. 자료 추가");
		System.out.println("    2. 자료 삭제");
		System.out.println("    3. 자료 수정");
		System.out.println("    4. 전체 자료 출력");
		System.out.println("    0. 작업 끝.");
		System.out.println("--------------------");
		System.out.print("작업선택 > ");
		return scan.nextInt();
	}

	private void memberStart() {
		while (true) {
			int choice = displayMenu();
			switch (choice) {
			case 1:
				insertMember();
				break;
			case 2:
				deleteMember();
				break;
			case 3:
				updateMember();
				break;
			case 4:
				displayAllMember();
				break;
			case 5:
				updateMember2();
			case 0:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("번호를 잘못 입력했습니다.");
				System.out.println("다시 입력하세요.");
			}
		}
	}

	private void updateMember2() {
		// TODO Auto-generated method stub
		
	}

	private void displayAllMember() {
		
	}

	private void updateMember() {
	      System.out.println();
	      System.out.println("수정할 회원 정보를 입력하세요.");
	      int count = 0; // 중복 여부를 검사하기 위한 변수 (회원ID개수가 저장될 변수)
	      String memId = null;
	      do {
	         System.out.print("회원ID >> ");
	         memId = scan.next();

	         count = service.getMemberCount(memId);
	         if (count > 0) {
	            System.out.println(memId + "은(는) 이미 등록된 회원ID 입니다.");
	            System.out.println("다른 회원ID를 입력하세요.");
	         }

	      } while (count > 0);

	      System.out.print("패스워드 >>");
	      String memPass = scan.next();

	      System.out.print("회원이름 >>");
	      String memName = scan.next();

	      System.out.print("전화번호 >>");
	      String memTel = scan.next();

	      scan.nextLine(); // 입력 버퍼 비우기
	      System.out.print("회원주소 >>");
	      String memAddr = scan.nextLine();

	      // 입력한 내용들을 VO에 담아 보내줘야함
	      // 입력한 데이터가 저장될 VO객체 생성
	      MemberVO memVO = new MemberVO();

	      // 입력한 데이터를 Vo에 저장(setting)
	      memVO.setMem_id(memId);
	      memVO.setMem_name(memName);
	      memVO.setMem_pass(memPass);
	      memVO.setMem_tel(memTel);
	      memVO.setMem_addr(memAddr);

	      int cnt = service.insertMember(memVO);
	      if (cnt > 0) {
	         System.out.println("회원 추가 성공!!!");
	      } else {
	         System.out.println("회원 추가 실패~~~");
	      }
		
	}

	private void insertMember() {
		System.out.println();
		System.out.println("추가할 회원 정보를 입력하세요.");
		int count = 0;
		String memId = null;
		do {
			System.out.println("회원ID >> ");
			memId = scan.next();

			count = service.getMemberCount(memId);
			if (count == 0) {
				System.out.println(memId + "은(는) 없는 ID 입니다");
				System.out.println("다른 회원ID를 입력하세요.");
			}

		} while (count > 0);

		System.out.print("패스워드 >>");
		String memPass = scan.next();

		System.out.print("회원이름 >>");
		String memName = scan.next();

		System.out.print("전화번호 >>");
		String memTel = scan.next();

		scan.nextLine(); // 입력 버퍼 비우기
		System.out.print("회원주소 >>");
		String memAddr = scan.nextLine();

		// 입력한 내용들을 VO에 담아 보내줘야함
		// 입력한 데이터가 저장될 VO객체 생성
		MemberVO memVO = new MemberVO();

		// 입력한 데이터를 Vo에 저장(setting)
		memVO.setMem_id(memId);
		memVO.setMem_name(memName);
		memVO.setMem_pass(memPass);
		memVO.setMem_tel(memTel);
		memVO.setMem_addr(memAddr);

		int cnt = service.insertMember(memVO);
		if (cnt > 0) {
			System.out.println("회원 추가 성공");
		} else {
			System.out.println("회원 추가 실패");
		}

	}

	private void deleteMember() {
		System.out.println();
		System.out.println("삭제할 회원 ID를 입력하세요");
		int count = 0;
		String memId = null;
		
		int cnt = service.deleteMember(memId);
		
		if(cnt > 0) {
			System.out.println("회원 정보 삭제 성공");
		} else {
			System.out.println("삭제 실패");
		}
	}

}


