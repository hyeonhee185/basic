package chapter2;

import java.util.Scanner;

public class Qqqq {

	public static void main(String[] args) {

		int num = 0;
		int sum = 0;
		System.out.println("입력");
		Scanner scanner = new Scanner(System.in);
		String temp = scanner.nextLine();
		num = Integer.parseInt(temp);

		while (num != 0) {
			sum += num % 10;
			System.out.println("sum=" + sum + "," + "num=" + num);
			num /= 10;

		}
		System.out.println("각자리 수의 합 :" + sum);
	}

}
