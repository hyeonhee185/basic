package chapter2;

import java.util.Scanner;

public class Question2244 {

	public static void main(String[] args) {
//		숫자 입력받아 숫자 합계 
		Scanner scanner = new Scanner(System.in);
		String num = scanner.next();
		int sum = 0;
		for (int count = 0; count < num.length(); count++) {
			sum += num.charAt(count) - '0';
		}
		System.out.println(sum);

		
		
		

	}

}
