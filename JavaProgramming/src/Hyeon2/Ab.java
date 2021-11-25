package Hyeon2;

import java.util.Arrays;
import java.util.Random;

public class Ab {

	public static void main(String[] args) {
		// 1. 정수 7개를 저장 할 수 있는 변수 score를 선언 및 생성하여라.
		int[] score = new int[7];
		// 2. 변수 score의 각 요소를 0이상 100이하인 임의의 정수를 저장하여라.
		Random random = new Random();
		for (int i = 0; i < score.length; i++) {
			score[i] = random.nextInt(101);
		}
//		score[0] = random.nextInt(101);
//		score[1] = random.nextInt(101);
//		score[2] = random.nextInt(101);
//		score[3] = random.nextInt(101);
//		score[4] = random.nextInt(101);
//		score[5] = random.nextInt(101);
//		score[6] = random.nextInt(101);
		// 3. 변수 score에 저장된 요소들의 합계를 구하여라.
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		// System.out.println("score의 값: " + Arrays.toString(score));
		// 4. 변수 score에 저장된 요소들의 평균들을 구하여라.

		double avg = (double) sum / score.length;
		// 5.최대값, 최소값
		int maxNum = 0;
		int minNum = 101;
		for (int i = 0; i < score.length; i++) {
			if (maxNum < score[i]) {
				maxNum = score[i];
			}
			if (minNum > score[i]) {
				minNum = score[i];
			}
		}
		System.out.print("score: {");
		for (int i = 0; i < score.length; i++) {
			if (i != 0) {
				System.out.print(", ");
			}
			System.out.print(score[i]);
		}
		System.out.println("}");
		System.out.println(Arrays.toString(score));
		System.out.println("합계: " + sum);
		System.out.println("평균: " + avg);
		System.out.println("최대값: " + maxNum);
		System.out.println("최소값: " + minNum);
		Arrays.sort(score);
	}

}
