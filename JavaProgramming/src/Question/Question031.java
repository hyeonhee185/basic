package Question;

import java.util.Scanner;

public class Question031 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("첫 번째 숫자를 입력하세요 ");
		int x = scanner.nextInt();
		System.out.print("두 번째 숫자를 입력하세요 ");
		int y = scanner.nextInt();
		System.out.println(Math.abs(x) > Math.abs(y)
				? "큰 수를 작은 수로 나눈 몫은 " + Math.abs(x) / Math.abs(y) + "이고,나머지는 " + Math.abs(x) % Math.abs(y) + "이다"
				: "큰 수를 작은 수로 나눈 몫은 " + Math.abs(y) / Math.abs(x) + "이고,나머지는 " + Math.abs(y) % Math.abs(x) + "이다");


//		if (x>y) {
//			System.out.println("큰 수를 작은 수로 나눈 몫은 "+x/y+"이고, 나머지는"+x%y+"이다.");
//		}
//		else if(y>x) {
//			System.out.println("큰 수를 작은 수로 나눈 몫은 "+y/x+"이고, 나머지는"+y%x+"이다.");
//		}
		
	}

}
