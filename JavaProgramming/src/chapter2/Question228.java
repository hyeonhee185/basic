package chapter2;

public class Question228 {

	public static void main(String[] args) {
		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b1 && b2);
		int int01 = 10;
		boolean re1 = int01 % 2 == 0;
		boolean re2 = int01 % 4 == 0;
		System.out.println(re1 || re2);

		
//		변수 ch01을 선언하고 원하는 문자로 초기화 하여라. 캐릭터타입
		String ch01 = "B"; /*문자 B가 담기는게 아니라 B의 숫자(66)가 담김*/
//		변수 ch01의 값이 영어 대문자일 때 true인 조건식을 작성하여라.
		System.out.println(Character.isUpperCase(ch01.charAt(0)));

//		변수 ch01의 값이 영어 소문자일 때 true인 조건식을 작성하여라.
		System.out.println(!Character.isLowerCase(ch01.charAt(0)));		
//		변수 ch01의 값이 영문자일 때 true인 조건식을 작성하여라.
		System.out.println(Character.isUpperCase(ch01.charAt(0))&&!Character.isLowerCase(ch01.charAt(0)));
//		변수 ch01의 값이 ASCII값 숫자 때 ture인 조건식을 작성하여라.
		
		
		
//		String ree1 = "H" = true;
//		String ree2 = "h" = true;
//		System.out.println(ree1 && ree2);
		
	}

}
