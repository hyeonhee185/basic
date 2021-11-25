package Question;

public class P452 {

	public static void main(String[] args) {
		
		int num1 = 10;
		String result1 = num1 > 0? "양수" : (num1 >= 0?  "0":"음수")   ;
		System.out.println(result1);

		int apples = 123;
		int bucket = 10;
		int numOfBucket = apples%bucket >0? apples/bucket+1 : apples/bucket+0;
//		int numOfBucket = apples / bucket + (apples % bucket > 0 ? 1:0);
		System.out.println("필요한 바구니의 수: "+numOfBucket);
		
		int num = 555;
		int result2 = num/100*100;
		System.out.println(result2);
		
		byte a = 10;
		byte b = 20;
		byte c = (byte)(a + b);
		char ch = 'A';
		ch = (char) (ch +2);
		float f =3 / 2f;
		System.out.println(f);
		long l = (long)(3000) * (long) (3000 * 3000);
		float f2 = 0.1f;
		System.out.println(f2);
		double d = 0.1;
		boolean result = (float)d==f2;
		System.out.println("c="+c);
		System.out.println("ch="+ch);
		System.out.println("f="+f);
		System.out.println("l="+l);
		System.out.println("result=" +result);
		
		int num2 = 24;
		int result4 = 10-num2%10 /*10의 배수*/ ;           
		System.out.println("result4: " + result4); 
	
		

		
		
		int fahrenheit = 100;
		float celcius = (int)((5/9f * (fahrenheit - 32))*100 + 0.5) / 100f ;
        System.out.println("Fahrenheit:"+fahrenheit);
        System.out.println("Celcius:"+celcius);

		
//        int fahrenheit = 100;
//        float formula = 5 / 9F * (fahrenheit - 32);
//        float celicius = celcius = (int)(formula * 100 + 0.5) / 100f ; 

        
        
		
		
	}

}
