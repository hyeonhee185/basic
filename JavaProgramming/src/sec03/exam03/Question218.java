import java.util.Random;
import java.util.Scanner;

public class Question218 {

	public static void main(String[] args) {

		Scanner scanner= new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		System.out.print("프로그래밍 기초:");
		int x = scanner.nextInt();
		System.out.print("데이터베이스: ");
		int y = scanner.nextInt();
		System.out.print("화면 구현: ");
		int z = scanner.nextInt();
		System.out.print("애플리케이션 구현: ");
		int w = scanner.nextInt();
		System.out.print("머닝러신: ");
		int v = scanner.nextInt();
		
		int sum = x+y+z+w+v;
		System.out.println("총점: "+sum);
		
		int average = (x+y+z+w+v)/5;
		System.out.println("평균: "+average);
		
		
		
		
//		int average =0 ;
//		System.out.println(average);

		switch (average / 10) {
		case 9:	case 10:
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
