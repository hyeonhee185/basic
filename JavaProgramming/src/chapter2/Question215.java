package chapter2;

import java.util.Scanner;

public class Question215 {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int num = scanner.nextInt();
	
	System.out.println();
	 if (num % 2 == 0) {
		 System.out.println("2의 배수입니다.");
	 } else {
		 System.out.println("2의 배수가 아닙니다.");
	}
}
}