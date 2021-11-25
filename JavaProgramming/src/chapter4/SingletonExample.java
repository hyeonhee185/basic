package chapter4;

//외부
public class SingletonExample {
	public static void main(String[] args) {

		MySingleton.instance1 = MySingleton.getInstance(); // 호출할때마다 static MySingleton instance = new MySingleton(); 씀
		MySingleton.instance2 = MySingleton.getInstance();
		if (instance1 == instance2) {
			System.out.println("instance는 같은 객체");
		}
		Car car1 = new Car("a");
		Car car2 = new Car("a");
		if (car1 == car2) {
			System.out.println("car는 같은 객체");
		}
	}
}
