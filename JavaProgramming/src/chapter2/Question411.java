package chapter2;

import java.util.Scanner;

public class Question411 {

	public static void main(String[] args) {
//		숫자 입력받아 첫숫자와 끝숫자 곱

		Scanner scan = new Scanner(System.in);

		double x = 0;
		double y = 0;

		System.out.print("첫 번째 계산할 값을 입력하세요: ");
		x = scan.nextDouble();

		System.out.print("두 번째 계산할 값을 입력하세요: ");
		y = scan.nextDouble();

		double mul = x * y;

		System.out.print("\n곱: " + mul);

	}

}
