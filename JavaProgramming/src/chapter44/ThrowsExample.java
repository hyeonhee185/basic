package chapter44;

public class ThrowsExample {
	public static void main(String[] args) throws Exception {
		findClass();
		throw new Exception();
	}

	public static void findClass() {
		try {
			Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
