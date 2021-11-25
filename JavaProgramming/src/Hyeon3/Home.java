package Hyeon3;

import java.util.Random;
import java.util.Scanner;

public class Home {
	public static void main(String[] args) {

		int[] lotto = new int[45];
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1;
		}
		int tmp = 0;
		Random random = new Random();
		for (int i = 0; i < lotto.length; i++) {
			int ranNum = random.nextInt(45);
			tmp = lotto[i];
			lotto[i] = lotto[ranNum];
			lotto[ranNum] = tmp;

		}
		String result = "로또 번호: ";
		for (int i = 0; i < 6; i++) {
			if (i != 0) {
				result += ", ";
			}
			result += lotto[i];
		}
		System.out.println(result);
	}

}
