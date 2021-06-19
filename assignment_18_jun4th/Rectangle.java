package assignment_18_jun4th;

public class Rectangle extends Shape {
	float length;
	float breadth;

	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rectangle(float length, float breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getBreadth() {
		return breadth;
	}

	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}

	@Override
	void getArea() {
		float area = breadth * length;
		System.out.println("Area of the Rectangle is : " + area);
	}

	@Override
	void getPerimeter() {
		float perimeter = (2 * (length + breadth));
		System.out.println("perimeter of the Rectangle is :" + perimeter);

	}

}
