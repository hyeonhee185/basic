package Hyeon2;

public class Ae {
	public static void main(String[] args) {
		int sum = 0;
		
		int[] score = {40,80,73,84,92};
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		System.out.println(sum);
	}

}
