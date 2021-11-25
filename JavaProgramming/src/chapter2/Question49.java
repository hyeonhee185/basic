package chapter2;

import java.util.Scanner;

public class Question49 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int inputNum = scanner.nextInt();
		int sum = 0;
		while (inputNum > 0) {
			sum += inputNum % 10;
			inputNum = inputNum / 10;
			if (inputNum == 0) {
				break;
			}
		}
	}

}
