package chapter4;

public class Question382 {

	public static void main(String[] args) {
// 		7. 3번의 add메서드를 호출하여라
		System.out.println(MyAdd.add(1000));
// 		8. 4번의 add메서드를 호출하여라
		MyAdd myAdd = new MyAdd();
		System.out.println(myAdd.add(100, 200));
// 		9. 5번의 add메서드를 호출하여라
		System.out.println(myAdd.add(2000, 300000L));
// 		10. 6번의 add메서드를 호출하여라
		System.out.println(myAdd.add('1', 100f));
	}
}
