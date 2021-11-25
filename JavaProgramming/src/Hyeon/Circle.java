package Hyeon;

public class Circle {
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		if (radius < 0) {
			this.radius=0;
			return;
		}else {

		this.radius = radius;
		}
	}

	public double getArea() {
		return radius * radius * 3.14;
	}

	private double getX;

	public double getX() {
		return getX;
	}

	public void setX(double getX) {
		this.getX = getX;
		if (getX < 0) {
			this.getX = 0;
		}
	}

	private double getY;

	public double getY() {
		return getY;
	}

	public void setY(double getY) {
		this.getY = getY;
	}

}
