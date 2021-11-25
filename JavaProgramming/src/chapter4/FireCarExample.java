package chapter4;

public class FireCarExample {

	public static void main(String[] args) {
		Carr c = new FireCar();
		FireCar fc = (FireCar) c; // 자식객체로 형변환X
//		PoliceCar p = new PoliceCar();
		Carr p = new PoliceCar();
		getFireCar(c);
		FireCar f = (FireCar) c;// 캐스팅
		f.water();
	}

	static void getFireCar(Carr c) {
		System.out.println(c instanceof Carr);// Carr의 인스턴스냐
		System.out.println(c instanceof FireCar);// FireCar의 인스턴스냐

	}
}
