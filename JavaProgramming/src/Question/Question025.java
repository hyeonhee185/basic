package Question;

import java.util.Scanner;

public class Question025 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("500원짜리 동전의 갯수: ");
		int x = scanner.nextInt();
		System.out.print("100원짜리 동전의 갯수: ");
		int y = scanner.nextInt();
		System.out.print("50원짜리 동전의 갯수: ");
		int z = scanner.nextInt();
		System.out.print("10원짜리 동전의 갯수: ");
		int w = scanner.nextInt();
		System.out.print("저금통 안의 동전의 총 액수: " + (long) (500 * x + 100 * y + 50 * z + 10 * w));
	}

}
