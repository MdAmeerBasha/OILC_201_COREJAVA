package ass18thMay;

import java.util.*;

public class ECC38_FillMultiples {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an one any Integer");
		int num = scanner.nextInt();
		int res[] = getMultiplesArray(num);
		int j = 1;
		for (int i = 0; i < res.length; i++) {
			System.out.println(num + " * " + j + " = " + res[i]);
			j++;
			scanner.close();
		}
	}

	public static int[] getMultiplesArray(int num) {
		int arr[] = new int[10];
		if (num == 0) {
			return null;
		} else {
			int j = 0;
			for (int i = 1; i <= arr.length; i++) {
				arr[j] = num * i;
				j++;
			}
		}
		return arr;
	}

}
