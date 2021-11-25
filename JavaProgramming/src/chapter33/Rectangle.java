package chapter33;

public class Rectangle extends Shape {
	// 필드
	private double width;
	private double height;

	// 생성자
	public Rectangle() {

	}

	public Rectangle(double width, double height) {

		this.width = width;
		this.height = height;
	}

	public double area() {
		return width * height;
	}

	public double perimeter() {
		return (2 * width) + (2 * height);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("도형의 종류: 사각형, 둘레:");
		builder.append(perimeter());
		builder.append("cm, 넓이 :");
		builder.append(area());
		builder.append("cm^2");
		return builder.toString();

	}

}