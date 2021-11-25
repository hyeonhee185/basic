package chapter2;

import java.util.Iterator;

public class Question219 {

	public static void main(String[] args) {
//		1. 0 이상 5 이하에서 정수를 결과와 같이 출력하여라.
//		결과: 0 1 2 3 4 5
		for (int i = 0; i < 6; i++) {
			System.out.print(i + " ");
		}

//		2. 0 이상 5 이하에서 정수를 결과와 같이 출력하여라.
//		결과: 5 4 3 2 1 0

		for (int i = 5; i >= 0; i--) {
			System.out.print(i + " ");
		}

//		3. 2 이상 10 이하 정수의 합계를 구하여라.

		int sum = 0;
		for (int i = 2; i < 11; i++) {
//			sum = sum + i;
			sum+=i;
		}
		System.out.println(" ");
		System.out.println("3번 : " + sum);

//		4. 5 이상 15 미만에서 정수의 곱을 구하여라.

		long x = 1;
		for (int i = 5; i < 15; i++) {
			x = x * i;

		}
		System.out.println("4번 : " + x);

//		5. 3 이상 4462 이하에서 짝수인 정수의 합을 구하여라.

		int y = 0;
		for (int i = 3; i < 4462; i++) {
			if (i % 2 == 0) {
				y += i;                    /* y += i 짝수일 때만 합 */
			}

		}

		System.out.println("5번 : " + y);

//		6. 7 초과 57 미만에서 2 또는 3의 배수인 정수의 합을 구하여라.

		int sum1 = 0;
		for (int i = 8; i < 57; i++) {
			if(i % 2 == 0 || i % 3 == 0) {
				sum1 += i;
			}
			
		}
		System.out.println("6번 : " +sum1);

	}

}
