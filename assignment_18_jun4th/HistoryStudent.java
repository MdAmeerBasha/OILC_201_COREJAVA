package assignment_18_jun4th;

public class HistoryStudent extends Student {
	int historyMarks;
	int civicsMarks;

	double getPercentage() {
		int total_Marks = historyMarks + civicsMarks;
		return total_Marks / 2;

	}

	public HistoryStudent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HistoryStudent(String stuentName, String studentClass, int historyMarks, int civicsMarks) {
		super(stuentName, studentClass);
		super.getTotalNoStuents();
		this.historyMarks = historyMarks;
		this.civicsMarks = civicsMarks;

	}

	@Override
	public String toString() {
		return "HistoryStudent [historyMarks=" + historyMarks + ", civicsMarks=" + civicsMarks + ", stuentName="
				+ stuentName + ", studentClass=" + studentClass + ", getPercentage()=" + getPercentage() + "]";
	}

	

}
