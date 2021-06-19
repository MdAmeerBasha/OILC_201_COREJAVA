package assignment_20_jun11th;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Emp {
	private int empNo;
	private String ename;
	private String designation;
	private double salary;

	public int getEmpNo() {
		return empNo;
	}

	public String getEname() {
		return ename;
	}

	public String getDesignation() {
		return designation;
	}

	public double getSalary() {
		return salary;
	}

	public Emp(int empNo, String ename, String designation, double salary) {
		super();
		this.empNo = empNo;
		this.ename = ename;
		this.designation = designation;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Emp [empNo=" + empNo + ", ename=" + ename + ", designation=" + designation + ", salary=" + salary + "]";
	}

}

public class EmployeeData {
	public static void main(String[] args) throws Exception {
		List<Emp> empList = new ArrayList<Emp>();
		FileReader fr = new FileReader("D:\\abc.txt");
		BufferedReader br = new BufferedReader(fr);
		String line = "";
		while ((line = br.readLine()) != null) {
			String str[] = line.split(",");
			Emp e = new Emp(Integer.parseInt(str[0]), str[1], str[2], Double.parseDouble(str[3]));
			empList.add(e);
		}
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter emp no ?");
		int empNo = scanner.nextInt();
		boolean b = false;
		for (Emp e : empList) {
			if (e.getEmpNo() == empNo) {
				System.out.println(e.getEname() + " " + e.getDesignation() + " " + e.getSalary());
				b = true;
			}
		}
		if (!b) {
			System.out.println("not available");
		}
	}

}
