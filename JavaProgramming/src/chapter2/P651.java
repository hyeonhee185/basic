package chapter2;

public class P651 {

	public static void main(String[] args) {
//		1+(-2)+3+(-4)+...와 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100이상이 되는지 구하시오.

		int sum = 0;
		int num = 0;

		while (sum < 100) {
			++num;
			if (num % 2 == 0)
				sum -= num;
			else
				sum += num;

		}
		System.out.println("총합= " + num);

// 		주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력		
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				if ((i + j) == 6)
					System.out.println("1번 주사위: " + i + ", 2번 주사위: " + j);
			}
		}


	}

}
