package assignment_21_jun15th;

import java.util.List;
import java.util.Scanner;

public class ArrayToListMainClass {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Size of the array ");
		int size = scanner.nextInt();
		String[] array = new String[size];

		System.out.println("Enter " + size + " elements ");
		for (int i = 0; i < size; i++) {
			array[i] = scanner.next();
		}
		ArrayToList obj = new ArrayToList();
		List<String> list = obj.convertToList(array);
		System.out.println(list);
	}
}
