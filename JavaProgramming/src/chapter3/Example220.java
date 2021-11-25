package chapter3;

public class Example220 {

	public static void main(String[] args) {
		int sum = 0;
		
		int[] score = {40, 80, 73, 84, 92};
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		float average = 0f;
		average = (float) sum / score.length;
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + average);
	}

}
