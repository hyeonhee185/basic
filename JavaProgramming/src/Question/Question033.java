package Question;

import java.util.Scanner;

public class Question033 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("입력");
		int x = scanner.nextInt();
		System.out.println(x%4==0?(x%100==0?(x%400==0?"윤년":"평년"):"윤년"):"평년");
		
//		System.out.println(x % 4 == 0 ? (x % 400 == 0 ? (x % 100 == 0 ? "윤년" : "윤년 아님") : "윤년 아님") : "윤년 아님");
	}

}
