package chapter2;

import java.util.Random;

public class P44 {

	public static void main(String[] args) {
		Random random = new Random();
		// 1. 변수 x를 선언하고 0이상 100미만 사이의 임의의 정수 값으로 초기화 하여라.
		int x = random.nextInt(100) ;  
		System.out.println(x);

		// 2. 변수 x2를 선언하고 43 초과 375 미만 사이의 임의의 정수 값으로 초기화 하여라.
		int x2 = random.nextInt(375 - 44) + 44;
		System.out.println(x2);
	}

}
