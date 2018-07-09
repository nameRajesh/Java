package pac2;

public class Application3 {
	public static void main(String[] args) {
		Triangle triangle = new Triangle();
		Drawing drawing = new Drawing();
		drawing.setShape(triangle);
		drawing.drawShape();
	}
}
