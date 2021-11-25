package Question;

import java.util.Scanner;

public class Question032 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("수도입니까?(수도: 1, 수도아님: 0)");
		int x = scanner.nextInt();
		System.out.print("총 인구는?(단위: 만)");
		int y = scanner.nextInt();
		System.out.print("연소득이 1억 이상인 인구는?(단위: 만)");
		int z = scanner.nextInt();
		
		System.out.println(x==1&&y>=100&&z>=50?"이 도시는 메트로폴리스입니다.":"아닙니다");
		
		
	}

}
