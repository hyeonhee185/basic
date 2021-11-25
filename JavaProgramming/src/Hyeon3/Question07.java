package Hyeon3;

import java.util.Random;
import java.util.Scanner;

public class Question07 {

//	private static final String String = null;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("가위 바위 보를 입력하세요.");
		Random random = new Random();
		int x = random.nextInt(3);

		System.out.print("철수: ");
		String player1 = scanner.next();
		System.out.print("컴퓨터: ");
		int player2 = random.nextInt(2);
		switch (player2) {
		case 0:
			System.out.println("가위");
			break;
		case 1:
			System.out.println("바위");
			break;
		case 2:
			System.out.println("보");
			break;
		default:
			break;

		}
		String result = "";

//		if (player1.equals(player2)) {
//			result = "비김!";
//		} else if (player1.equals("가위") && player2.equals("보") || player1.equals("바위") && player2.equals("가위")
//				|| player1.equals("보") && player2.equals("가위")) {
//			result = "철수 승리!";
//		} else {
//			result = "컴퓨터 승리!";
//		}

		System.out.println(result);
		scanner.close();
	}

}
