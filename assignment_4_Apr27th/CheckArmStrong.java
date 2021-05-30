package assignment_4_Apr27th;

public class CheckArmStrong {
	public static void main(String[] args) {

		try {
			int num = Integer.parseInt(args[0]);

			if (num > 0) {
				ArmStrong.arm(num);
			} else {
				System.out.println("Error");
			}

		} catch (Exception e) {
			System.out.println("Error");
		}
	}

}

class ArmStrong {
	public static void arm(int num) {
		int temp = num;
		int num2 = 0;

		while (num != 0) {
			int a = num % 10;// =>1
			num = num / 10;// =>53
			num2 = num2 + (a * a * a);// (153)=>1*1*1=1,5*5*5=125,3*3*3=27 ==>1+125+27=153
		}
		if (temp == num2) {
			System.out.println("ArmStrong Number");
		} else {
			System.out.println("Not ArmStrong Number");
		}

	}
}
