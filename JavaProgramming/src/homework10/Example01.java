package homework10;

import java.util.InputMismatchException;
import java.util.Scanner;

class homework10 {

	public static void main(String[] args) {

		double r = 0;
		double area;
		String input;

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("반지름을 입력 해주세요");

			try {
				r = sc.nextDouble();
			} catch (InputMismatchException ime) {
				System.out.print("반지름은 숫자로 입력해 주셔야 합니다. 잘못된 입력으로 ");
				break;
			}

			area = r * r * 314;

			System.out.println("원의 넓이:" + area);

			System.out.println("프로그램을 계속 진행하시겠습니까?");
			input = sc.next();

			if (input.equalsIgnoreCase("Y"))
				continue;

			else if (input.equalsIgnoreCase("N"))
				break;

			else
				System.out.print("Y나 N만 입력해 주세요. 잘못된 입력으로");
			break;

		}
		System.out.println(" 시스템을 종료합니다");
	}
}