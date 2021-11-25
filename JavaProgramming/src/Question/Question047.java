package Question;

import java.util.Scanner;

public class Question047 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("허용 오차: ");
		double tolerance = scanner.nextDouble();
		double pi = 3;
		double sign = 1;
		long i = 2; 									/* 0으로하면 16번째 줄 0이 됨 */
		int count = 0;									/* 카운팅 개수 */
		while (true) {
			pi += 4.0 / (i * (i + 1) * (i + 2)) * sign; /* if줄이 int로 계산돼서 */
			sign *= -1;
			i += 2;
			if (tolerance > Math.abs(Math.PI - pi)) {
				break;
			}
			count++;
		}
		System.out.println("Math.PI = " + Math.PI);
		System.out.println("계산된 파이값: " + pi);
		System.out.println("반복 횟수: " + count);
		scanner.close();

	}

}
