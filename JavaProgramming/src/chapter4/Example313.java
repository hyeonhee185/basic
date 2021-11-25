package chapter4;

public class Example313 {

	public static void main(String[] args) {
		TimeVO tv = new TimeVO();
		tv.setHour(46);
		tv.setMinute(112);
		tv.setSecond(4853);
		System.out.println("현재시간: " + tv.getTime() + "시" + tv.getMinute() + "분" + tv.getSecond() + "초");
		
	}
	public void setHour(int hour) {
		
	}
	public int getMinute() {
		return minute;
	}
	
	public void setMinute(int minute) {
		
	}
	public int getSecound() {
		return second;
	}
	public void setSecound(int second) {
		
	}
}
