package chapter44;

import java.util.regex.Pattern;

public class Question52 {
	public static void main(String[] args) {
//		System.out.println(Pattern.matches("[a-z]{2,3}", "sss"));
//
//		System.out.println(Pattern.matches("[a-zA-Z]{3}[0-9]+", "xyz32"));
//
//		System.out.println(Pattern.matches("[0]{1}[1]{1}[01789]{1}-[0-9]{4}-[0-9]{4}", "010-2928-5998"));
//
//		System.out.println(Pattern.matches("[0-9]{6}-[1-4]{1}[0-9]{6}", "991122-2848736"));
//		System.out.println(Pattern.matches("\\d{3}-\\d{4}-\\d{4}", "010-2928-5998"));
		System.out.println(Pattern.matches("\\d{4}/[0-1]{1}[0-9]{1}/[0-2]{1}[0-9]{1}", "1994/07/27"));
		System.out.println(Pattern.matches("[0-9]{4}/[0-1]{1}[0-9]{1}/[0-3]{1}[0-9]{1}", "1994/07/27"));

//		System.out.println(Pattern.matches("[1-4]\\d{6}", "2415414"));
		System.out.println(Pattern.matches("^[a-zA-Z0-9]{2,10}", "4ada3849141"));
//		System.out.println(Pattern.matches("[a-zA-Z]{1}[*]+@[a-zA-Z]{5,6}.[a-zA-Z]{2,3}", "jhh2802@naver.com"));
//		System.out.println(Pattern.matches("[a-zA-Z][a-zA-Z0-9-_\\.]*@[a-zA-Z0-9]{1,7}.[a-zA-Z]{2,3}(.kr)", "s_3274b@ddit.or.kr"));
//		System.out.println(Pattern.matches("[a-zA-Z][a-zA-Z0-9-_\\.]*@[a-zA-Z0-9]{1,7}.[a-zA-Z]{2,3}(.kr)", "s_3274b@ddit.or.kr"));
		
				
	}
}
