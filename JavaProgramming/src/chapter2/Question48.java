package chapter2;

public class Question48 {

	public static void main(String[] args) {
//		1+(-2)+3+(-4)+...와 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100이상이 되는지 구하시오.

		int sum = 0;
		int i = 1;

		while (true) {

			sum += (i % 2 == 0) ? -i : i;
			if (sum >= 100) {
				break;

			}
			i++;
		}
		System.out.println(i);
	}

}
