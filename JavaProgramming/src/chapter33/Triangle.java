package chapter33;

public class Triangle extends Shape {
	private double side;

	public Triangle() {
	}

	public Triangle(double side) {
		this.side = side;
	}

	public double area() {
		return (Math.sqrt(3) / 4) * Math.pow(side, 2);
	}

	public double perimeter() {
		return side * 3;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("도형의 종류: 삼각형, 둘레:");
		builder.append(perimeter());
		builder.append(",");
		builder.append("넓이:");
		builder.append(area());

		return builder.toString();
	}

}