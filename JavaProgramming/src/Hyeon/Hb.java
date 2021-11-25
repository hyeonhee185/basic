package Hyeon;

import java.util.Scanner;

public class Hb {

	public static void main(String[] args) {
		
		
		int x = 0;
		int y = 0;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("몇번째?");
			x = scanner.nextInt();
			
			if (x<3) {
			System.out.println("더 큰 수");	
			}
			else if(x>3) {
				
			}
			
			
			
		} while (x>3);
		System.out.println("응");
		
	}
}
