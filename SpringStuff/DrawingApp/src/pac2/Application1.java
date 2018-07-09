package pac2;

public class Application1 {
	public static void main(String[] args) {
		// Using polymorphism
		Shape shape = new Triangle();
		shape.draw();
		shape = new Circle();
		shape.draw();
	}
}
