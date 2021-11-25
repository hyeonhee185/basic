package Question;

import java.util.Random;
import java.util.Scanner;

public class Question045 {

	public static void main(String[] args) {

//		1부터 100 사이의 임의의 정수 생성
		
		Random random = new Random();
		int randomNum = random.nextInt(100) + 1;// 1~100
		System.out.println(randomNum);
		Scanner scanner;
		while (true) {
			scanner = new Scanner(System.in);
			System.out.print("1부터 100 사이의 정수 중 하나를 선택하세요: ");
			int inputNum = scanner.nextInt();
			if (randomNum == inputNum) {
				System.out.println("정답입니다.");
				break;
			} else if (randomNum > inputNum) {
				System.out.println("더 큰 수 입니다.");
			} else {
				System.out.println("더 작은 수 입니다");
			}
		}
		scanner.close();

	}

}
