package chapter4;

import java.util.Random;

public class Question39 {

	public static void main(String[] args) {

//		6. double 메서드를 호출 하여라
		int distance = doubleDice();
//		7. 총 이동거리를 출력하여라
		System.out.println(distance);

	}

	static int doubleDice() {
		Random random = new Random();
//	1.첫 번째 주사위 : 1~6 사이의 임의의 정수를 변수 firstDice에 저장하여라
		int firstDice = random.nextInt(6) + 1;
//	2.두 번째 주사위 : 1~6 사이의 임의의 정수를 변수 secondDice에 저장하여라
		int secondDice = random.nextInt(6) + 1;
//	3. 두 주사위의 합을 변수 result에 저장하여라
		int result = firstDice + secondDice;
		System.out.println(firstDice + "," + secondDice);
//	4. 만일 두 주사위의 값이 같다면 주사위 두개를 한 번 더 던지도록 하여라
		if (firstDice == secondDice) {
			result += doubleDice();
		}
//	5. 전체 주사위 값의 합을 반환하여라
		return result;
	}
}
