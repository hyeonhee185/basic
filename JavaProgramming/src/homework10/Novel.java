package homework10;

public class Novel extends Book {

	public Novel(String title, String author) {
		super(title, author);

	}

	@Override
	public int getLateFee(int lateDays) {
		// TODO Auto-generated method stub
		return lateDays * 300;
	}

}
