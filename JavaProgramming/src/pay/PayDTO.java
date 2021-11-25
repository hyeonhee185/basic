package pay;

import java.util.List;
import java.util.Scanner;

import pay.PayDAO;
import pay.PayTest;

public class PayDTO {
	private static PayDAO dao = new PayDAO();
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PayTest main = new PayTest();
		mainLoop: while(true) {
			System.out.println("1.카카오페이\t2.신용카드\t3.휴대폰결제\t4.결제취소");
			System.out.println("결제수단 선택");
			int pay = scanner.nextInt();
			switch(pay) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				System.out.println("결제를 취소합니다.");
				break mainLoop;
			}
		}
		scanner.close();
	}
}
