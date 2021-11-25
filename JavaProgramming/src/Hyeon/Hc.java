package Hyeon;

import java.util.Scanner;

public class Hc {

	public static void main(String[] args) {
//3이하 숫자 입력 시 반복
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("몇 번째 항까지 출력하시겠습니까?(3 이상 입력): ");
			int inputNum = scanner.nextInt();
			if (inputNum >= 3) {
				break;
			}
			System.out.println("3 이상의 숫자를 입력하세요.");

		}

		scanner.close();

	}

}
