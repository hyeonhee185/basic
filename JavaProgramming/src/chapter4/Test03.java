package chapter4;

import java.util.Arrays;
import java.util.Random;

public class Test03 {
	public static void main(String[] args) {
//	3. 6명의 7과목의 점수(정수)를 저장할 수 있는 변수 score를 선언 및 생성하여라. 단, names와 subjects의 길이를 이용하여라

		String[] names = new String[6];
		names[0] = "안예솔";
		names[1] = "이인환";
		names[2] = "정재헌";
		names[3] = "이웅희";
		names[4] = "임성민";
		names[5] = "김수정";
		String[] subjects = { "국어", "영어", "수학", "사회", "과학", "Oracle", "Java" };

//		int[][] score = new int[5][6];
		int[][] score = new int[names.length][subjects.length];
		Random random = new Random();
//		score의 모든 요소에 0~100 사이의 임의의 정수 값을 저장하여라

//		score[0][0] =random.nextInt(101);
//		score[0][1] =random.nextInt(101);
//		score[0][2] =random.nextInt(101);
//		score[0][3] =random.nextInt(101);
//		score[0][4] =random.nextInt(101);
//		score[0][5] =random.nextInt(101);
//		score[0][6] =random.nextInt(101);...

//		for (int j = 0; j < score[0].length; j++) {
//			score[0][j] = random.nextInt(101);
//		}

		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) { 			// 반복문이 반복문을 감싸기
				score[i][j] = random.nextInt(101);
			}
		}

	}
}
