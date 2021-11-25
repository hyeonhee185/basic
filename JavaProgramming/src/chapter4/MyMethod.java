package chapter4;

public class MyMethod {
	public static void main(String[] args) {
		MyMethod method = new MyMethod();
		method.method2(100);
		MyMethod.method3(100);
	}

	void method1(int num) {
		System.out.println("입력된 값은 " + num + "입니다.");
	}

	void method2(int num) {
		MyMethod.method3(200);
		method1(20);
		System.out.println("입력된 값은 " + num + "입니다.");
	}

	static void method3(int num) {
		MyMethod method = new MyMethod();
		method.method2(100);
		System.out.println(num * 3);
	}
}
