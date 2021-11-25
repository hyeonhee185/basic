package chapter3;

import java.util.Arrays;
import java.util.Random;

public class Question56 {

	public static void main(String[] args) {

		int[] ballArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] ball3 = new int[3];
		Random random = new Random();

		for (int i = 0; i < ballArr.length; i++) {
			int ranNum = random.nextInt(9);
			int temp = 0;
			temp = ballArr[i];
			ballArr[i] = ballArr[ranNum];
			ballArr[ranNum] = temp;

		}
		ball3[0] = ballArr[0];
		ball3[1] = ballArr[1];
		ball3[2] = ballArr[2];

		System.out.println(Arrays.toString(ball3));
	}

}
