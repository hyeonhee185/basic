package Hyeon3;

import java.util.Scanner;

public class Question03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("월을 입력하세요");
		int x = scanner.nextInt();
		int day = 0;
		switch (x) {
		case 1:	case 3:	case 5:	case 7:	case 8:	case 10: case 12:
			day = 31;
			break;
		case 4:	case 6:	case 9:	case 11:
			day = 30;
			break;

		case 2:
			day = 28;
			break;

		default:
			break;
		}
		System.out.println(x + "월은 " + day + "일까지 입니다");
		scanner.close();
	}

}
