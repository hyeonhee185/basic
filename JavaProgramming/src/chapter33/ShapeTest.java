package chapter33;

import java.util.Iterator;

public class ShapeTest {
public static void main(String[] args) {
	Shape[] shapes = new Shape[3];
	shapes[0] = new Circlee(1.0);
	shapes[1] = new Triangle(2.0);
	shapes[2] = new Rectangle(2.0, 3.0);
	for (Shape shape : shapes) {
		System.out.println(shape);
	}
}
}
