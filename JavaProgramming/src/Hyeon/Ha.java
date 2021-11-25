package Hyeon;

import java.util.Scanner;

public class Ha {

	public static void main(String[] args) {
		
		int x = 0;
		Scanner scanner = new Scanner(System.in);
		 

		 do {
			 x = scanner.nextInt();
			 System.out.print("몇 번째 항까지 출력하시겠습니까?(3 이상 입력) ");
			 if (x<3) {
				System.out.println("3 이상");
			}else if(x>3) {
				
			}
			 
		} while (x>3);
		 
		 
//		int a = 0;
//		int b = 1;
//		int c = 1;
//
//		for (int d = 0; d < x; d++) {
//			System.out.print(" " + c);
//			c = a + b;
//			a = b;
//			b = c;
//
//		}
	}

}
