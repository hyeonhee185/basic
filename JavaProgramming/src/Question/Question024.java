package Question;

import java.util.Scanner;

public class Question024 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("원기둥 밑면의 반지름을 입력하시오.(단위: cm)");
		double x = scanner.nextDouble();
		System.out.print("원기둥의 높이를 입력하시오.(단위: cm)");
		double y = scanner.nextDouble();

//		double z = (int) ((x*x*Math.PI*2)+(x*y*Math.PI*2));
		double z = x * x * Math.PI;
		System.out.print("원기둥 밑면의 넓이는 " + z);
		double v = z * y;
		System.out.println("이고, 원기둥의 부피는 " + v + " 이다.");
	}

}
