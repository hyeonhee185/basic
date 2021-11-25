package homework10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example04 {
	public static void main(String[] args) {
		while (true) {
			try {
				Scanner scanner = new Scanner(System.in);
				System.out.print("어떤 수로 나누시겠습니까?");
				int x = scanner.nextInt();
				System.out.print("어떤 수를 나누시겠습니까?");
				int y = scanner.nextInt();
				System.out.println(x + "/" + y + "=" + x / y);
				break;
			} catch (InputMismatchException e) {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요");
			} catch (ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요");
			}
		}
	}
}
