package chapter44;

public class Rectangle extends Shape {
	private double width;
	private double height;

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public double area() {
		return width * height;
	}

	@Override
	public double perimeter() {
		return (width + height) * 2;
	}

	@Override
	public String toString() {
		return "도형의 종류: 사각형, 둘레: " + (int)(perimeter()*100)/100f + "㎝, 넓이: " + (int)(area()*100)/100f + "㎠";
	}
}
