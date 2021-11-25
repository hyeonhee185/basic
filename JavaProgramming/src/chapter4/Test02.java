package chapter4;

import java.util.Arrays;

public class Test02 {
	public static void main(String[] args) {
//	2. 7과목의 이름을 저장할 수 있는 변수 subjects를 선언 및 생성하고 국어, 영어, 수학, 사회, 과학, ,Oracle, Java로 초기화하여라
		String[] subjects = new String[7];
		subjects[0] = "국어";
		subjects[1] = "영어";
		subjects[2] = "수학";
		subjects[3] = "사회";
		subjects[4] = "과학";
		subjects[5] = "Oracle";
		subjects[6] = "Java";
		System.out.println(Arrays.toString(subjects));
	}
}
