package assignment24thMarch;

import java.util.Scanner;

public class EvenList {
	static int j = 0;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of array");
		int length = scanner.nextInt();
		int a[] = new int[length];
		System.out.println("Enter values into Array");

		for (int i = 0; i < length; i++) {
			a[i] = scanner.nextInt();
		}

		int[] b = getEvenArray(a);

		for (int i = 0; i < j; i++) {
			System.out.println(b[i]);
		}
		scanner.close();

	}

	public static int[] getEvenArray(int[] a) {
		int b[] = new int[a.length];
		if (a.length == 10) {
			return null;
		} else {
			for (int i = 0; i < a.length; i++) {
				if (a[i] % 2 == 0) {
					b[j] = a[i];
					j++;
				}
			}
			return b;
		}
	}

}
