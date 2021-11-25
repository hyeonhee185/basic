package chapter44;

import java.util.Iterator;

public class SplitExample {
	public static void main(String[] args) {
		String str = "아이디,이름,패스워드";
		String[] sArr = str.split(",");
		
//		System.out.println(sArr[0]);
//		System.out.println(sArr[1]);
//		System.out.println(sArr[2]);
		
		for (int i = 0; i < sArr.length; i++) {
			System.out.println(sArr[i]);
		}
		
		for (String s : sArr) {
			System.out.println(s);
		}
	}
}
