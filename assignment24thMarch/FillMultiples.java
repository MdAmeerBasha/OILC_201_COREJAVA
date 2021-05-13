package assignment24thMarch;

public class FillMultiples {

	public static void main(String[] args) {

		try {
			int num = Integer.parseInt(args[0]);
			if (num > 0) {
				Multiple.getMultiplesArray(num);
			} else {
				System.out.println("Error");
			}
		} catch (Exception e) {
			System.err.println("Error" + e);
		}
	}

}

class Multiple {
	public static void getMultiplesArray(int num) {
		int[] a = new int[11];
		for (int i = 1; i < a.length; i++) {
			a[i] = i * num;
			System.out.println(a[i]);
		}
	}
}
