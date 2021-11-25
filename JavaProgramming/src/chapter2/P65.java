package chapter2;

public class P65 {

	public static void main(String[] args) {
//		1 + (1+2) + (1+2+3) + (1+2+3+4)+...+(1+2+3+...+10)의 결과
		
		int sum = 0;
		for (int i = 0; i <= 10; i++) {
			for (int j = 1; j <= i; j++) {
				sum += j;   /* sum = sum + j */
//				System.out.print(j);
			}
		}
		System.out.println("sum=" + sum);

	}

}
