package pac2;

public class Application2 {
	public static void myDrawMethod(Shape shape) {
		shape.draw();
	}

	public static void main(String[] args) {
		Shape triangle = new Triangle();
		myDrawMethod(triangle);
		Shape circle = new Circle();
		myDrawMethod(circle);
	}
}
