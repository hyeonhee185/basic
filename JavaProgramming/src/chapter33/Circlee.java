package chapter33;

public class Circlee extends Shape {
	private double radius;

	Circlee(double radius) {
		this.radius = radius;
	}

	public double parimeter() {
		return radius * 2 * Math.PI;

	}

	public double area() {
		return radius * radius * Math.PI;

	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("도형의 종류: 원, 둘레: ");
		builder.append(parimeter());
		builder.append(",");
		builder.append(" 넓이: ");
		builder.append(area());
		return builder.toString();
	}
}
