package Hyeon3;

import java.util.Scanner;

public class Question04 {

	public static void main(String[] args) {
		System.out.print("원하는 단을 입력하세요: ");
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();

		for (int i = 1; i < 10; i++) {
			System.out.println(x + "*" + i + "=" + (x * i));
		}

		scanner.close();
	}

}
