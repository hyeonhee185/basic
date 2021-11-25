package promotion;

import java.util.List;
import java.util.Scanner;

import promotion.PromotionDAO;
import promotion.PromotionDTO;

public class PromotionTest {
	private static PromotionDAO dao = new PromotionDAO();

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PromotionTest main = new PromotionTest();
		mainLoop: while (true) {
			System.out.println("1.프로모션 내용 확인\t2.할인가능 여부 조회\t3.종료");
			System.out.print("메뉴를 선택하세요:");
			int menu = scanner.nextInt();
			switch (menu) {
			case 1:
				System.out.println("1.KB국민카드 5프로 할인");
				System.out.println("2.생일 프로모션");
				System.out.println("3.기념일 프로모션");
				break;
			case 2:
				System.out.print("1.KB국민카드 5프로 할인\t");
				System.out.print("2.생일 프로모션\t");
				System.out.println("3.기념일 프로모션");
				System.out.print("적용할 번호 입력");
				int menu2 = scanner.nextInt();
				switch (menu2) {
				case 1:
					System.out.println("국민카드 예약 시 할인");
					break;
				case 2:

					System.out.println("로그인 한 회원 생일:");
					break;
				case 3:

					System.out.println("회원가입 시 설정한 기념일:");
					break;
				}

				break;
			case 3:
				// 종료
				System.out.println("종료합니다.");
				break mainLoop;
			}
			break;
		}
		scanner.close();
	}
}
