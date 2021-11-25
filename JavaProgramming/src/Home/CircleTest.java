package Home;

public class CircleTest {

	public static void main(String[] args) {

		Circle c1 = new Circle(5.0);
		System.out.println(c1.toString());
		System.out.println("c1의 반지름은 " + c1.getRadius() + " 입니다.");
		System.out.println("c1의 면적은 " + c1.getArea() + " 입니다.");

		Circle c2 = new Circle(1.2);
		System.out.println(c2.toString());
		System.out.println("c1의 반지름은 " + c2.getRadius() + " 입니다.");
		System.out.println("c1의 면적은 " + c2.getArea() + " 입니다.");
		System.out.println("Operator '+' invokes toString() too : " + c2);

		Circle c4 = new Circle();
		c4.setRadius(5.0);
		System.out.println("c1의 반지름은 " + c4.getRadius() + " 입니다.");
		System.out.println("c1의 면적은 " + c4.getArea() + " 입니다.");
		System.out.println("radius is " + c4.getRadius());
		c4.setColor("Navy");
		System.out.println("Color is " + c4.getColor());

		// System.out.println(c4.setRadius(4.0));
	}
}