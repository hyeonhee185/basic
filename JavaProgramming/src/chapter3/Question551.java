package chapter3;

public class Question551 {

	public static void main(String[] args) {
		int[] coinUnit = { 500, 100, 50, 10 };
		int money = 2790;
		for (int i = 0; i < coinUnit.length; i++) {
			int x = money / coinUnit[i];
			int left = money - coinUnit[i] * x;
			money = left;
			System.out.println(coinUnit[i]+ "원: "+ x);
			
			/*	if (i == 0) {
				System.out.println("500원: " + x);
			} else if (i == 1) {
				System.out.println("100원: " + x);
			} else if (i == 2) {
				System.out.println("50원: " + x);
			} else if (i == 3) {
				System.out.println("10원: " + x);
			} */
		}

	}

}
