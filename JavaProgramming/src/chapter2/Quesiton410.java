package chapter2;

public class Quesiton410 {

	public static void main(String[] args) {


//	     피보나치 수열은 앞의 두 수를 더해 다음 수를 만들어 나가는 수열로 1,1,2,3,5,8,13,21,...과 같은 식으로 진행된다. 10번째 수는 무엇인지

		int a1 = 1;
		int a2 = 1;
		int a3;

		System.out.println(a1);
		System.out.println(a2);

		for (int i = 1; i <= 8; i++) {
			a3 = a1 + a2;
			System.out.println(a3);
			a1 = a2;
			a2 = a3;
		}

	}
}
