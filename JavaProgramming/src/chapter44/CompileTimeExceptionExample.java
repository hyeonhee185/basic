package chapter44;

public class CompileTimeExceptionExample {
	public static void main(String[] args) throws ClassNotFoundException {
			Class.forName("java1.lang.String");
	}
}
