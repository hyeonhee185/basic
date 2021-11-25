package chapter4;

public class Question38 {
	public Question38() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	}

}

class MyAdd {
//	1. 클래스 변수 a를 선언하고 20의 값으로 초기화 하여라
	static int a = 20;
//	2. 인스턴스변수 b를 선언하고 15의 값으로 초기화 하여라
	int b = 15;

//	3. int타입의 매개변수가 하나이며 변수 a의 합을 반환하는 클래스메서드 add를 작성하여라
	static int add(int num) {
		return a + num;
	}

//	4. int타입의 매개변수가 두개이고 매개변수의 합을 반환하는 인스턴스메서드 add를 작성하여라
	int add(int num1, int num2) {
		return num1 + num2;
	}

//	5. int타입, long타입 각 한 개의 매개변수,매개변수의 합을 반환하는 인스턴스 메서드 add 작성하여라	
	long add(int num1, long num2) {
		return num1 + num2;
	}

//	6. char타입, float 타입 각 한 개의 매개변수, 매개변수의 합을 반환하는 인스턴스 메서드 add를 작성하여라
	float add(char num1, float num2) {
		return num1 + num2;
	}

}
