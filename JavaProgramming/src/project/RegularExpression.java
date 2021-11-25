package project;

import java.util.Scanner;

public class RegularExpression {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String source = "2012-02-04";
		String pattern = "^[0-9][0-9][0-9][0-9]\\-[0-9][0-9]\\-[0-9][0-9]$"; // ^시작,$끝
		if (!source.matches(pattern)) {// (년도-월-일) 의 패턴으로 넘어오는지 체크
			System.out.println("년월일의 패턴이 아닙니다.");
		}

	}
}
