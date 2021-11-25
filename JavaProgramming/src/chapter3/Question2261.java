package chapter3;

import java.util.Random;

public class Question2261 {

	public static void main(String[] args) {
//		1. 정수 7개를 저장할 수 있는 변수 score 선언 및 생성하여라.
		int[] score = new int[7];
//		2. 변수 score의 각 요소를 0이상 100이하인 임의의 정수를 저장하여라.
		Random random = new Random();
		for (int i = 0; i < score.length; i++) {
			score[i] = random.nextInt(100)+1;
			System.out.print(" " + score[i]);
		}
		
//		3. 변수 score에 저장된 요소들의 합계를 구하여라.
		int sum = 0;
		
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		System.out.println();
		System.out.println("합계: "+sum);
//		4. 변수 score에 저장된 요소들의 평균을 구하여라 (소수점 세번째 자리에서 반올림하여 두번째 자리까지 표현)
		float avg = 0;
		for (int i = 0; i < score.length; i++) {
			avg = sum/(float)(score.length);
		}
		System.out.println("평균: "+(int)(avg*100)/100f);
//		5. 변수 score에 저장된 요소에서 최댓값을 구하여라
		int max = score[0];
		int min = score[0];
//		6. 변수 score에 저장된 요소에서 최소값을 구하여라
		for (int i = 0; i < score.length; i++) {
			if (max<score[i]) {
				max=score[i];
			}else if (min>score[i]) {
				min=score[i];
			}
		}
		System.out.println("최대값: "+max);
		System.out.println("최소값: "+min);
//		7. 1~6번의 결과를 이용하여 결과와 같이 출력하여라
	}

}
