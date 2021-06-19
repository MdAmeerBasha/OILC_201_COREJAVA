package assignment_18_jun4th;

public class Square extends Shape {
	float side;

	public Square() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Square(float side) {
		super();
		this.side = side;
	}

	public float getSide() {
		return side;
	}

	public void setSide(float side) {
		this.side = side;
	}

	@Override
	void getArea() {
		float area = side * side;
		System.out.println("Area of the Square is : " + area);
	}

	@Override
	void getPerimeter() {
		float perimeter = 4 * side;
		System.out.println("perimeter of the Square is :" + perimeter);

	}

}
