package chapter4;

public class Calc {
	static int add(int a, int b) {
		int result = a + b;
		return result;
	}

	int substract(int a, int b) {
		int result = a - b;
		return result;
	}

	int multiply(int a, int b) {
		int result = a * b;
		return result;
	}

	float divide(float a, float b) {
		float result = ((int) ((a / b) * 100) / 100f);
		return result;
	}
}
