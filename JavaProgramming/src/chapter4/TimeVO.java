package chapter4;

// VO(value object) ==DTO(data transfer object)
// DateVO -> year(년) month(월) date(일) day(요일)
public class TimeVO {

	private int hour;
	private int minute;
	private int second;

	public void setHour(int hour) {
		if (hour >= 0 && hour < 24) {
			this.hour = hour;
		}
	}

	public void getMinute() {
		this.hour = hour;
	}

	public void setMinute(int minute) {
		if (minute >= 0 && minute < 60) {
			this.minute = minute;
		} else {

		}
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if (second < 0) {
			return;
		} else if (second < 60) {
			this.second = second;
		} else {
			int m = second / 60;
			int h = 0;
			if (m >= 60) {
				h = m / 60;
			}
			this.minute += second / 60;
			this.second = second % 60;
		}

	}
}