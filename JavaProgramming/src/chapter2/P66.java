package chapter2;

public class P66 {

	public static void main(String[] args) {
		String value = "1234";
		char ch = ' ';
		boolean isNumber = true;
		for (int i = 0; i < value.length(); i++) {
			ch = value.charAt(i);
			if (ch >= '0' && ch <= '9') {
				isNumber = true;
			} else {
				isNumber = false;
				break;
			}
		}
		if (isNumber) {
			System.out.println(value + "는 숫자입니다.");
		} else {
			System.out.println(value + "는 숫자가 아닙니다.");
		}
	}
}
