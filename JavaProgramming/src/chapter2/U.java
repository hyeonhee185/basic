package chapter2;

import java.util.Scanner;

public class U {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int inputNum = scanner.nextInt();
		System.out.println("입력하신 숫자는: " + inputNum);
		String inputStr = scanner.next();
		System.out.println("입력하신 문자는: " + inputStr);
	}

}
