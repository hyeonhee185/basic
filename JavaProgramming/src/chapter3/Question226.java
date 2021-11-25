package chapter3;

import java.util.Random;

public class Question226 {

	public static void main(String[] args) {
		Random random = new Random();
		int[] score = new int[7];
		System.out.print("score 값: {");
		for (int i = 0; i < score.length; i++) {
			
			score[i] = random.nextInt(100) + 1;
			
			System.out.print(", " + score[i]);
		}
		System.out.print("}");
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		System.out.println();
		System.out.println("합계: " + sum);
		float avg = 0;
		for (int i = 0; i < score.length; i++) {
			avg = sum / (float) score.length;

		}
		System.out.println("평균: " + (int) (avg * 100) / 100f);
		int max = 0;
		int min = score[0];
		for (int i = 0; i < score.length; i++) {
			if (score[i] > max) {
				max = score[i];
			} else if (score[i] < min) {
				min = score[i];
			}


		}
		System.out.println("최대값: " +max);
		System.out.println("최소값: " +min);
	}

}
