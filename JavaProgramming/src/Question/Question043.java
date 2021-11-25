package Question;

import java.util.Scanner;

public class Question043 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		System.out.print("프로그래밍 기초:");
		float x = scanner.nextFloat();
		System.out.print("데이터베이스: ");
		float y = scanner.nextFloat();
		System.out.print("화면 구현: ");
		float z = scanner.nextFloat();
		System.out.print("애플리케이션 구현: ");
		float w = scanner.nextFloat();
		System.out.print("머닝러신: ");
		float v = scanner.nextInt();

		int sum = (int) (x + y + z + w + v);
		System.out.println("총점: " + sum);

		float average = (x + y + z + w + v) / 5;
		System.out.println("평균: " + (int) (average * 100) / 100f);

		switch ((int) average / 10) {
		case 9:
		case 10:
			System.out.println("학점: A");
			break;
		case 8:
			System.out.println("학점: B");
			break;
		case 7:
			System.out.println("학점: C");
			break;
		case 6:
			System.out.println("학점: D");

			break;
		default:
			System.out.println("학점: F");
			break;
		}

	}

}
