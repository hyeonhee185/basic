package Hyeon2;

public class Student extends Human {
	private String major;
	
	public Student(String name,int age, String major) {
		super(name,age);
		this.major=major;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return "이름: "+super.getName()+", 나이: "+this.getAge()+", 전공: "+ major ;
	}


	
}
