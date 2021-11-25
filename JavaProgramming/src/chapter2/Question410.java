package chapter2;

public class Question410 {
	public static void main(String[] args) {
		
//		0 1 2 3 5 8 13 ... 피보나치 수열 
		
		int num1 = 0;
		int num2 = 1;
		int num3 = 0;
		System.out.println(num1 + ", " + num2);
		for (int i = 0; i < 9; i++) {
			num3 = num1 + num2;
		}
		System.out.print("" + num3);
		num1 = num2;
		num2 = num3;
		
	}
}
