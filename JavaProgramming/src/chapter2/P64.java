package chapter2;

public class P64 {

	public static void main(String[] args) {
//		2. 1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합
		int y = 0;
		for (int i = 1; i < 20; i++) {
			if (!(i % 2 == 0 || i % 3 == 0)) {
				y += i;
			}
			
//			if(i % 2 != 0 && i % 3 != 0) 9번째 줄과 같은말
		}

		System.out.println(y);

//		3.구구단 for->while로
		
		int dan = 2;
		int gob = 1;

		while (dan < 10) { 							//2단~9단
			while (gob < 10) {
				System.out.println(dan + "*" + gob + "=" + dan * gob);
				gob++;
			}

			gob = 1;
			dan++;
		}
		
		

	}

}