package assignment_16_jun1st;

public class Marks extends Student1 {
	private int m1, m2, m3;

	public Marks(int sId, String sName, int m1, int m2, int m3) {
		super(sId, sName);
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}
	public void dispStudent() {
		System.out.println("No :" + sId);
		System.out.println("Name :" + sName);
		System.out.println("Marks are " + m1 + " " + m2 + " " + m3);
		System.out.println("marks :" + totalMarks());

	}

	public int totalMarks() {
		return m1 + m2 + m3;
	}

}
