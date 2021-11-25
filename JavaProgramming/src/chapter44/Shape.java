package chapter44;

public abstract class Shape implements Comparable<Shape> {
	public Shape() {
	}

	public abstract double area();

	public abstract double perimeter();

	@Override
	public int compareTo(Shape o) {
		return Double.compare(this.area(), o.area());
	}
}