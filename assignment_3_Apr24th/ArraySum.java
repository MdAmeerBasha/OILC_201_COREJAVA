package assignment_3_Apr24th;

public class ArraySum {

	public static void main(String args[]) {
		try {
			int[] arr = new int[10];

			for (int i = 0; i < args.length; i++) {
				arr[i] = Integer.parseInt(args[i]);
			}

			System.out.println(FindSum.getSum(arr));
		} catch (Exception e) {
			System.err.println("Error");
		}
	}

}

class FindSum {

	public static int getSum(int[] arr) {
		int sum = 0;
		if (arr.length != 0) {
			for (int i = 0; i < arr.length; i++) {
				sum = sum + arr[i];
			}
		} else {
			return -1;
		}
		return sum;
	}
}
