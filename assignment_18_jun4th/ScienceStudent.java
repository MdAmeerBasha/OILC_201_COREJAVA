package assignment_18_jun4th;

public class ScienceStudent extends Student {
	int physicslMarks;
	int chemistryMarks;
	int mathsMarks;

	@Override
	double getPercentage() {
		int total_Marks = physicslMarks + chemistryMarks + mathsMarks;
		return total_Marks / 3;

	}

	public ScienceStudent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ScienceStudent(String stuentName, String studentClass, int physicslMarks, int chemistryMarks,
			int mathsMarks) {
		super(stuentName, studentClass);
		super.getTotalNoStuents();
		this.physicslMarks = physicslMarks;
		this.chemistryMarks = chemistryMarks;
		this.mathsMarks = mathsMarks;

	}

	@Override
	public String toString() {
		return "ScienceStudent [physicslMarks=" + physicslMarks + ", chemistryMarks=" + chemistryMarks + ", mathsMarks="
				+ mathsMarks + ", stuentName=" + stuentName + ", studentClass=" + studentClass + ", getPercentage()="
				+ getPercentage() + "]";
	}

	

}
