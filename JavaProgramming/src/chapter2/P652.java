package chapter2;

import java.util.Scanner;

public class P652 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int sum =1;
		int num1 = (x - y >= 0 ) ? y : x;
		int num2 = (x - y < 0 ) ? y : x;
		
		for (int i = num1; i <= num2; i++) {
			sum = sum *i;
		}
		System.out.println(sum);
	}

}
