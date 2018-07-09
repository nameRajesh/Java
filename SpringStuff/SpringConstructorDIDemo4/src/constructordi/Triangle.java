package constructordi;

public class Triangle {
	private String type;

	private int height;

	public String getType() {
		return type;
	}

	public Triangle(String type) {
		this.type = type;
	}

	
	public Triangle(String type, int height) {
		this.type = type;
		this.height = height;
	}

	public int getHeight() {
		return height;
 }

//	public void draw() {
//		System.out.println(getType() + " Triangle drawn");
//	}

	public void draw() {
		System.out.println(getType() + " Triangle drawn of height "
				+ getHeight());
	}
}
