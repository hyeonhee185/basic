package Hyeon3;

public class Calculator {
//	1.add
	int add(int num1, int num2) {// int 대신 void 쓰면 에러x

		return num1 + num2;
	}

//	2.substract
	int substract(int num1, int num2) {
		return num1 - num2;
	}

//	3.multiply
	long multiply(int num1, int num2) {
		return (long) num1 * num2;
	}

//	4.divide 소수점 둘째자리에서 반올림
	double divide(int num1, int num2) {
		return (int) ((double) num1 / num2 * 10 + 0.5) / 10.0;
	}
}
