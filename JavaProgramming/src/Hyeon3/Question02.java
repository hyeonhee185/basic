package Hyeon3;

import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("나이를 입력하세요 ");
		int x = scanner.nextInt();
		if (x == 20 || x == 21 || x == 22 || x == 23 || x == 24 || x == 25 || x == 26 || x == 27 || x == 28
				|| x == 29) {
			System.out.println("20대 입니다.");
		} else {
			System.out.println("20대가 아닙니다");
		}
		scanner.close();
	}

}
