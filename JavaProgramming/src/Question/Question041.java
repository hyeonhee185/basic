package Question;

import java.util.Scanner;

public class Question041 {

	public static void main(String[] args) {
//		사용자로부터 세 변의 길이 입력 받은 후 삼각형 만들 수 있는 길이되는지
//		가장 긴 변의 길이가 다른 두 변의 길이의 합보다 작으면 삼각형 가능

		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 변 : ");
		int x = scanner.nextInt();
		System.out.print("두번째 변 : ");
		int y = scanner.nextInt();
		System.out.print("세번째 변 : ");
		int z = scanner.nextInt();

		if ((x + y) > z && (x + z) > y && (y + z) > x) {
			System.out.println("삼각형 가능");
		} else {
			System.out.println("불가");
		}
	}

}
