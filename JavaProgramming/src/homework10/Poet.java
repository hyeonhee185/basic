package homework10;

public class Poet extends Book {

	public Poet(String title, String author) {
		super(title, author);
	}

	@Override
	public int getLateFee(int lateDays) {
		// TODO Auto-generated method stub
		return lateDays * 200;
	}

}
