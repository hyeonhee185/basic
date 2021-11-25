package Question;

import java.util.Scanner;

public class Question044 {

	public static void main(String[] args) {
//		가위 바위 보 게임
		Scanner scanner = new Scanner(System.in);
		System.out.println("가위 바위 보를 입력하세요.");

		System.out.print("철수: ");
		String player1 = scanner.next();
		System.out.print("영희: ");
		String player2 = scanner.next();
		String result = "";
		/* 문자열 비교할때는 ==이 아니고 .equals로 사용 */
		if (player1.equals(player2)) {
			result = "비김!";
		} else if (player1.equals("가위") && player2.equals("보") 
				|| player1.equals("바위") && player2.equals("가위")
				|| player1.equals("보") && player2.equals("가위")) {
				result = "철수 승리!";
		}else {
			result = "영희 승리!";
		}
		
		System.out.println(result);
		scanner.close();

	}

}
