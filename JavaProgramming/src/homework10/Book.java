package homework10;

public abstract class Book {
	public int number;
	public String title;
	public String author;
	public static int countOfBooks = 0;

	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
		this.number = number;
		countOfBooks++;
		number = countOfBooks;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
	public abstract int getLateFee(int lateDays);

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("관리번호 " + number + "번");
		builder.append(", 제목: ");
		builder.append(title);
		builder.append(", 작가: ");
		builder.append(author);
		builder.append("일주일 연체료: ");
		builder.append(getLateFee(7) + "원)");
		return builder.toString();
	}

}
