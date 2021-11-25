package chapter44;

public class NumberFormatExceptionExample {
	public static void main(String[] args) {
		try {
			String data1 = "100";
			String data2 = "a100";

			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);

			int result = value1 + value2;
			System.out.println(result);
		} catch (NumberFormatException e) {
			System.out.println("에러 발생");
		} finally {
			System.out.println("무조건 실행");

		}

	}
}
