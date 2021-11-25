package Question;

import java.util.Scanner;

public class Question046 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long num1 = 0;
		long num2 = 1;
		long num3 = 0; /*int는 12억이상 -로 보여져서 long으로 선언*/
		String result = "0 1 ";
		while (true) {
			System.out.print("몇 번째 항까지 출력하시겠습니까?(3 이상 입력): ");
			int inputNum = scanner.nextInt();
			if (inputNum >= 3) {

				for (int i = 2; i < inputNum; i++) {
					num3 = num1 + num2;
					result += num3 + " ";
					num1 = num2;
					num2 = num3;

				}
				System.out.println(result);
				break;
			}
			System.out.println("3 이상의 숫자를 입력하세요.");

		}

		scanner.close();

	}

}
