package assignment_18_jun4th;

public class Circle extends Shape {
	float radius;

	public Circle() {
		super();

	}

	public Circle(float radius) {
		super();
		this.radius = radius;
	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	@Override
	void getArea() {
		float area = 3.14f * (radius * radius);
		System.out.println("Area of the Circle is : "+area);
	}

	@Override
	void getPerimeter() {
		float perimeter = 2 * 3.14f * radius;
		System.out.println("perimeter of the Circle is :"+perimeter);
	}

}
