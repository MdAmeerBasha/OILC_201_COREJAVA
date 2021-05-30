package assignment_6_Apr29th;

public class AbsoluteNumber {
	public static void main(String[] args) {
		try {
			int num = Integer.parseInt(args[0]);
			int result = 0;
			if (num < 0) {
				result = num * -1;
			} else {
				result = num;
			}
			System.out.println("Absolute number is :" + result);
		} catch (Exception e) {
			System.out.println("please enter the number only");
		}
	}

}
