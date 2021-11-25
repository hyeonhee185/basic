package chapter4;

import java.util.Scanner;

public class Qu3_5 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int firstNum = scanner.nextInt();
		String operator = scanner.next();
		int secondNum = scanner.nextInt();
		Calc calc = new Calc();
		String result = "";
		switch (operator) {
		case "+":
			int add = calc.add(firstNum, secondNum);
			result = calc.add(firstNum, secondNum) + "";
			break;
		case "-":
			result = calc.substract(firstNum, secondNum) + "";
			break;
		case "*":
			result = calc.multiply(firstNum, secondNum) + "";
			break;
		case "/":
			result = calc.divide(firstNum, secondNum) + "";
			break;
		default:
			result = "연산종료";
			break;
		}

//		calc.add(10, 20);

		System.out.println(result);
		scanner.close();
	}
}
