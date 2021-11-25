package chapter44;

public class Circle extends Shape {
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	@Override
	public double area() {
		return Math.PI * radius * radius;
	}
	@Override
	public double perimeter() {
		return 2 * Math.PI * radius;
	}
	@Override
	public String toString() {
		return "도형의 종류: 원, 둘레: " + (int)(perimeter()*100)/100f + "㎝, 넓이: " + (int)(area()*100)/100f + "㎠";
	}

}