package chapter4;

public class TVExamle {
	public static void main(String[] args) {

		
		TV tv1 = new TV(); //객체화
		TV tv2 = new TV();
		TV tv3 = new TV();
		TV tv4 = new TV();
		TV tv5 = new TV();
		TV tv6 = new TV();
		TV tv7 = new TV();
		tv1.channel = 10;
		tv1.volume = 30;
		System.out.println(tv1.volume);
		System.out.println(tv2.volume);
		System.out.println(tv2.isPower);
		System.out.println(tv2.model);
		tv3.channel = 15;
		System.out.println(tv3.channel);
		
	}
}
