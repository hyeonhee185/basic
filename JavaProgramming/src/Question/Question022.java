package Question;

public class Question022 {

	public static void main(String[] args) {

		double distanc = 40e12;

		double x = distanc / 300000;
		double y = x / (60 * 60 * 24 * 365);
		System.out.println("빛의 속도로 프록시마 센타우리 별까지 가는데 걸리는 시간은 " + y + " 광년 입니다.");

	}

}
