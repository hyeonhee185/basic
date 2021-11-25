package chapter2;

import java.util.Random;

public class Question217 {

	public static void main(String[] args) {

		Random random = new Random();
		int random1 = random.nextInt(5)+1;
		System.out.println(random1);

		switch(random1) {
		case 1:
			System.out.println("32평 아파트 당첨");
			break;
		case 2:
			System.out.println("자동차 당첨");
			break;
		case 3:
			System.out.println("노트북 당첨");
			break;
		case 4:
		System.out.println("자전거 당첨");
			break;
		case 5:
			System.out.println("다음 기회에");
			break;
		}
		
		
		
		
	}

}


