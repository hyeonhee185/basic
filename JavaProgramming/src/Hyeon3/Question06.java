package Hyeon3;

import java.util.Arrays;
import java.util.Random;

public class Question06 {

	public static void main(String[] args) {

		Random random = new Random();
		int[] score = new int[7];
		for (int i = 0; i < score.length; i++) {

			score[i] = random.nextInt(45) + 1;

		}
		System.out.print(Arrays.toString(score));

	}

}
