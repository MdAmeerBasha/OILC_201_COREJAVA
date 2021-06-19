package assignment_18_jun4th;

public abstract class Student {
	String stuentName;
	String studentClass;
	protected static int totalNoOfStudents;

	abstract double getPercentage();

	static void getTotalNoStuents() {
		totalNoOfStudents++;
		System.out.println("Total no of Students : " + totalNoOfStudents);

	}

	public Student() {
		super();

	}

	public Student(String stuentName, String studentClass) {
		super();
		this.stuentName = stuentName;
		this.studentClass = studentClass;
	}

}

