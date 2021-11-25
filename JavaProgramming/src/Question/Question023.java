package Question;

import java.util.Scanner;

public class Question023 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 수를 입력하세요: ");
		int x = scanner.nextInt();
		System.out.print("두번째 수를 입력하세요: ");
		int y = scanner.nextInt();

		boolean z = x > y;
		System.out.println("첫번째 수가 두번째 수보다 큰가? " + z);

	}

}
