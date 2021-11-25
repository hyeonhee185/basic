package chapter3;

public class Question55 {

	public static void main(String[] args) {
		int[] coinUnit = { 500, 100, 50, 10 };
		int money = 2790;
		for (int i = 0; i < coinUnit.length; i++) {
			System.out.println(coinUnit[i] + "원:" + money / coinUnit[i]);

//			money = money % coinUnit[i];

		}

	}

}