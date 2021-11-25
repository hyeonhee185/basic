package Question;

public class P58 {

	public static void main(String[] args) {

		for (int dan = 2; dan < 10; dan++) {

			System.out.println(dan + "단");
			for (int gob = 1; gob < 10; gob++) {
				if (dan % 2 == 0) {
					System.out.println(dan + "*" + gob + "=" + dan * gob);
				}

			}
		}

	}

}
