package assignment_15_May31st;

import java.util.Scanner;

public class ECC91_ConvertTime {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Time in 24hour formate anf get in 12hour formate");
		String time = scanner.next();
		System.out.println(isConvertTime(time));
		scanner.close();

	}

	public static String isConvertTime(String time) {
		String res="";

		String[] arr = time.split(":");
		int hh = Integer.parseInt(arr[0]);
		int mm = Integer.parseInt(arr[1]);
		int ss = Integer.parseInt(arr[2]);

		if ((hh < 0 || hh > 24) || (mm < 0 || mm > 60) || (ss < 0 || ss > 60)) {

			res ="Invalid Time";
		}
		else
		{
			if(hh>=12)
			{
			
				res =hh-12+":"+mm+":"+ss+" PM";
			}
			else
			{
				res =hh+":"+mm+":"+ss+" AM";
			}
		}

		return res;

	}


}
