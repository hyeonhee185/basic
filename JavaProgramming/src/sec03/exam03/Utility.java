import java.util.Random;

public class Utility {

	public static void main(String[] args) {
//		Random 수 구하기
//		1. 공식 : (int) (Math.random() * 마지막 수) + 처음 수 	
		System.out.println((int)(Math.random() * 10) + 1);
//		2. Random이라는 클래스를 이용하는 방법
		Random random = new Random();
//		random.nextInt(10);  // 0부터 9까지
		int num = random.nextInt(11) + 1; // 1부터 10까지
		System.out.println(num);
	}

}
