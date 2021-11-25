package Hyeon2;

public class TimeVO {
	private int hour;
	private int minute;
	private int second;

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		if (hour >= 0) {
			this.hour = hour % 24;
		}
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if (minute >= 0) {
			setHour(this.hour += minute / 60);
			this.minute = minute % 60;
		}
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if (second >= 0) {
			setMinute(this.minute += second / 60);
			this.second = second % 60;
		}
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("현재 시각: ");
		sb.append(hour).append("시 ");
		sb.append(minute).append("분 ");
		sb.append(second).append("초");
		return sb.toString();
	}
}