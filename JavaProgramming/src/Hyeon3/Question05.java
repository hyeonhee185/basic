package Hyeon3;

public class Question05 {

	public static void main(String[] args) {
//		다음 배열에서 최댓값과 최솟값을 구하시오.  {38,94,16,3,76,94,82,47,59,8}
		int score[] = { 38, 94, 16, 3, 76, 94, 82, 47, 59, 8 };

		int max = 0;
		int min = score[0];
		for (int i = 0; i < score.length; i++) {
			if (score[i] > max) {
				max = score[i];
			} else if (score[i] < min) {
				min = score[i];
			}

		}
		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);

	}

}
