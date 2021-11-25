package chapter44;

public class StringConvertExample {
	public static void main(String[] args) {
		String data1 = "200";
		int intData1 = Integer.parseInt(data1);
		
		int data2 = 150;
//		String strData2 = data2 +"";
//		String strData2 = Integer.toString(data2);
		String strData2 = String.valueOf(data2);
		
		System.out.println(data1);
		System.out.println(data2);
	}
}
