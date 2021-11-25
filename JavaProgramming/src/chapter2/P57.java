package chapter2;

public class P57 {

	public static void main(String[] args) {

/*		for (int dan = 2; dan < 10; dan++) {
		System.out.println(dan+"단");
			for (int gob = 1; gob < 10; gob++) {
				System.out.println(dan + "*" + gob + "=" + dan * gob);
			}
		}

		
		
			
		for (int a = 2; a < 10; a++) {
			for (int b = 1; b < 10; b++) {
				if (a % 2 == 0) {
					System.out.println(a + "*" + b + "=" + a * b);
				}

			}
		}

		
		
		
		for (int a = 2; a < 10; a++) {
			for (int b = 1; b < 10; b++) {

				if (a % 3 == 0) {
					System.out.println(a + "*" + b + "=" + a * b);

				}
			}
		}
		
		
		
		

		for (int count = 0; count < 3; count++) {
			for (int star = 0; star < 6; star++) {
				System.out.print("*");
			}
			System.out.println();
		}

*/		
		
		
//		별 계단식
		for (int count = 1; count <= 5; count++) {
			for (int star = 1; star <= count; star++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
		

				
		
	}

}
