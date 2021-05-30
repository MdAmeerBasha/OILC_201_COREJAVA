package assignment_6_Apr29th;

public class Student {
	public static void main(String[] args) {
		if (args.length != 5) {
			System.out.println("Please Enter  Five arguments only");
			return;
		}

		int total = 0, avg, marks;
		String grade = "";

		try {
			boolean b = true;
			for (int i = 0; i < args.length; i++) {
				marks = Integer.parseInt(args[i]);

				if (marks < 35) {
					b = false;
					System.out.println("Fail");
					break;
				} else {
					total = total + marks;
				}

			}
			if (b) {
				avg = total / 5;

				if (total >= 400) {
					grade = "A grade";
				} else if ((total >= 300) && (total < 400)) {
					grade = "B grade";
				} else if ((total >= 200) && (total < 300)) {
					grade = "C grade";
				} else {
					grade = "D grade";
				}

				System.out
						.println("Total is : " + total + " , " + "Average is : " + avg + " , " + "Grade is : " + grade);
			}
		} catch (Exception e) {
			System.out.println("Please enter Integer values only");
		}
	}
}
