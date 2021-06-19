package assignment_17_jun2nd;

import java.util.Scanner;

class Student {
	int sId;
	String sName;
	double examFee;

	public Student() {
		super();

	}

	public Student(int sId, String sName, double examFee) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.examFee = examFee;
	}

	public String displayDetails() {
		return "Student [sId=" + sId + ", sName=" + sName + ", examFee=" + examFee + "]";
	}

	public double payFee(double amount) {
		return examFee - amount;

	}

}

class DayScholar extends Student {
	double transFee;

	public DayScholar() {
		super();

	}

	public DayScholar(int sId, String sName, double examFee, double transFee) {
		super(sId, sName, examFee);
		this.transFee = transFee;

	}

	public String displayDetails() {
		return "DayScholar [transFee=" + transFee + ", sId=" + sId + ", sName=" + sName + ", examFee=" + examFee + "]";
	}

	public double payFee(double amount) {

		return (super.payFee(amount) + transFee);
	}

}

class Hosteller extends Student {
	double hostelFee;

	public Hosteller() {
		super();

	}

	public Hosteller(int sId, String sName, double examFee, double hostelFee) {
		super(sId, sName, examFee);
		this.hostelFee = hostelFee;

	}

	public double payFee(double amount) {
		return (super.payFee(amount) + hostelFee);

	}

	public String displayDetails() {
		return "Hosteller [hostelFee=" + hostelFee + ", sId=" + sId + ", sName=" + sName + ", examFee=" + examFee + "]";
	}

}

public class StudentInheritance {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Student id ,Name,Exam Fee");
		int id = scanner.nextInt();
		String name = scanner.next();
		double examFee = scanner.nextDouble();
		Student s1 = new Student(id, name, examFee);
		System.out.println(s1.displayDetails());
		System.out.println("1.DaySchlor\n2.Hosteller\n3.Exit");
		System.out.println("Enter your choice");
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Enter the Transport Fee only");
			double transFee = scanner.nextDouble();
			System.out.println("Enter the Amount only");
			double amount = scanner.nextDouble();
			DayScholar d1 = new DayScholar(id, name, examFee, transFee);
			System.out.println("Remaining amount : " + d1.payFee(amount));
			System.out.println(d1.displayDetails());
			break;
		case 2:
			System.out.println("Enter the Hostel Fee only");
			double hostelFee = scanner.nextDouble();
			System.out.println("Enter the Amount only");
			double amount2 = scanner.nextDouble();
			Hosteller h1 = new Hosteller(id, name, examFee, hostelFee);
			System.out.println("Remaining amount : " + h1.payFee(amount2));
			System.out.println(h1.displayDetails());
			break;
		case 3:
			System.exit(0);
		}
		scanner.close();

	}

}
