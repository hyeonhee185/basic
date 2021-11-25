package chapter44;

import java.util.Arrays;

public class ComparableExample {
	public static void main(String[] args) {
//		배열 정렬
		int[] numArr = { 96, 4, 28, 89, 0, 32, 68, 39, 29, 84, 91 };
		Arrays.sort(numArr);
		System.out.println(Arrays.toString(numArr));
	}
}
