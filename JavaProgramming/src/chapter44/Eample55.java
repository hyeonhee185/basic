package chapter44;

public class Eample55 {
	public static void main(String[] args) {
//		String 클래스를 이용한 문자열 결합
		int loopCount = 300000;
		long start = System.currentTimeMillis();
		String str = "a";
		for (int i = 0; i < loopCount; i++) {
			str += "a";
		}
		long end = System.currentTimeMillis();
		System.out.println("String결합 : " + (end - start) + "ms");

//		StringBuffer 결합
		long start1 = System.currentTimeMillis();
		StringBuffer sb1 = new StringBuffer("a");
		for (int i = 0; i < loopCount; i++) {
			sb1.append("a");
		}
		long end1 = System.currentTimeMillis();
		System.out.println("StringBuffer결합 : " + (end1 - start1) + "ms");

//		StringBuilder 결합
		long start2 = System.currentTimeMillis();
		StringBuilder sb2 = new StringBuilder("a");
		for (int i = 0; i < loopCount; i++) {
			sb2.append("a");
		}
		long end2 = System.currentTimeMillis();
		System.out.println("StringBuilder결합 : " + (end2 - start2) + "ms");
	}
}
