package Class;

public class Rectangle {
	private double length;
	private double width;

	double getArea() {
		double area;
		area = length * width;
		return area;
	}

	public Rectangle() {
	}

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public double getLength() {
		return this.length;
	}

	public double getWidth() {
		return this.width;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public static void main(String[] args) {
		Rectangle rec = new Rectangle(10, 8);
		double a = rec.getArea();
		System.out.println(a);
	}
}