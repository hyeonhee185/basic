package chapter33;

public class Car {
	private double speed;
	private String color;
	String car;
	private static final double maxspeed;
	double speedup;

	Car() {
	}

	Car(String color) {
		this.color = color;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		if (speed < 0) {
			this.speed = 0;
			return;
		} else {
			this.speed = speed;
		}
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public static double getMaxSpeed() {
		return maxspeed;
	}

	public void setMaxspeed(double maxspeed) {
		this.maxspeed = maxspeed;
	}

	public boolean speedUp(double speedup) {
		this.speedup = speedup;
		return true;

	}
		
}
