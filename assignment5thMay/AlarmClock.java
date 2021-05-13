package assignment5thMay;

import java.util.Scanner;

public class AlarmClock {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter  Day Number and vacation");
		System.out.println(getAlarm(scanner.nextInt(), scanner.nextBoolean()));
		scanner.close();
	}

	public static String getAlarm(int DayNum, boolean vacation) {
		String result = "";

		String vaca = String.valueOf(vacation);

		if ((DayNum >= 0 && DayNum <= 6) && (vaca.equals("true") || vaca.equals("false"))) {

			if ((DayNum > 0 && DayNum < 6) && vaca.equals("true")) {

				result += "10:00";
			} else if ((DayNum > 0 && DayNum < 6) && vaca.equals("false")) {

				result += "07:00";
			} else if ((DayNum == 0 || DayNum == 1) && vaca.equals("true")) {

				result += "OFF";
			} else {

				result += "10:00";
			}

		} else {

			result = "Invalid Inputs";
		}

		return result;
	}

}
