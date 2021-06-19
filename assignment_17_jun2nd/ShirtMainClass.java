package assignment_17_jun2nd;

import java.util.Scanner;

enum ShirtMterial {
	COTTON, LINEN, POLYSTER;
}

class Shirt {

	private float collarSize;
	private float length;
	private ShirtMterial material;

	public Shirt() {

		this.collarSize = 0;
		this.length = 0;
		this.material = ShirtMterial.COTTON;
	}

	public Shirt(float collarSize, float length, ShirtMterial material) {
		super();
		this.collarSize = collarSize;
		this.length = length;
		this.material = material;
	}

	public float getCollarSize() {
		return collarSize;
	}

	public void setCollarSize(float collarSize) {
		this.collarSize = collarSize;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public ShirtMterial getMaterial() {
		return material;
	}

	public void setMaterial(ShirtMterial material) {
		this.material = material;
	}

	public void displayDetails() {
		System.out.println("Shirt [collarSize=" + collarSize + ", length=" + length + ", material=" + material + "]");
	}
}

public class ShirtMainClass {
	public static void main(String[] args) {
		Shirt sh = new Shirt();
		sh.displayDetails();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Shirt collarSize and length");
		Shirt sh1 = new Shirt(scanner.nextFloat(), scanner.nextFloat(), ShirtMterial.POLYSTER);
		sh1.displayDetails();
		scanner.close();

	}
}
