package Hyeon;

import java.util.Scanner;

public class Home2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String num = scanner.next();
		int sum = 0;
		for (int count = 0; count < num.length(); count++) {
			sum += num.charAt(count) - '0';
		}
		System.out.println(sum);
	}
}
