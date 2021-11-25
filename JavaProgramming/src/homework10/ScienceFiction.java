package homework10;

public class ScienceFiction extends Book {

	public ScienceFiction(String title, String author) {
		super(title, author);
	}

	@Override
	public int getLateFee(int lateDays) {
		// TODO Auto-generated method stub
		return lateDays * 600;
	}

}
