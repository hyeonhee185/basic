package homework10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example02 {
	public static void main(String[] args) {
		while (true) {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.print("어떤 수로 나누시겠습니까?>>");
				int num1 = sc.nextInt();
				System.out.print("어떤 수를 나누시겠습니까?>>");
				int num2 = sc.nextInt();
				System.out.println(num1 + "/" + num2 + "=" + num1 / num2);
				break;
			} catch (InputMismatchException e) {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요");
			} catch (ArithmeticException e) {
				System.out.println("0으론 나눌 수 없습니다. 다시 입력해주세요");

			}
		}
	}
}
