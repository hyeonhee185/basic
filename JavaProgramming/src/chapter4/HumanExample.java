package chapter4;

public class HumanExample {
	public static void main(String[] args) {
		
//		Value Object(VO)  == DTO(Data Transfer Object)
//		bean(객체)
//		HumanVO
		Human h1 = new Human();// 메모리 상에 Human이라는 객체가 만들어짐
//		스택 = 힙
		h1.name = "유지아";
		h1.age = 10;

		Human h2 = new Human();
		h2.name = "김태일";
		h2.age = 15;
		
		System.out.println(h2.age);
	}
}
