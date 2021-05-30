package assignment_7_May4th;

import java.util.Scanner;

public class Month {
	public static void main(String[] args) {
		String res=" ";
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the month name");
		String str=scanner.next().toUpperCase();
		switch(str)
		{
		case "JANUARY":
		case "FEBRUARY":
		case "MARCH":
		case "APRIL":
		case "MAY":
		case "JUNE":
		case "JULY":
		case "AUGEST":
		case "SEPTEMBER":
		case "OCTOBER":
		case "NOVEMBER":
		case "DECEMBER":
		res=res+str;
		break;
			
		}
		System.out.println(res);
		
		
		
		
	}

}
