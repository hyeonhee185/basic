package chapter44;

public class Person implements Comparable {
	private String name;
	private double height;

	public Person() {

	}

	public Person(String name, double height) {
		this.name = name;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "이름: " + name + ",키: " + height + "㎝";
	}

//	compareTo()가 앞 값이 뒤 값보다 크면 1을 반환
//	작으면 -1 반환
//	같으면 0 반환
	/* 이름 순서로 */
/*	@Override
	public int compareTo(Object o) {
		if (name.compareTo(((Person) o).getName()) > 0) {
			return 1;
		} else if (name.compareTo(((Person) o).getName()) < 0) {
			return -1;
		} else {
			return 0;
		}
	}
*/
	/* 키 순서로 */
	@Override
	public int compareTo(Object o) {
		Double heightD = height;
		if (heightD.compareTo(((Person) o).getHeight()) > 0) {
			return 1;
		} else if (heightD.compareTo(((Person) o).getHeight()) < 0) {
			return -1;
		} else {
			return 0;
		}
	}
}
