package assignment_21_jun15th;

import java.util.ArrayList;
import java.util.List;


public class ListToArrayMainClass {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(89);
		list.add(71);
		list.add(35);
		list.add(41);
		System.out.println("List of  Elements are :");
		System.out.println(list);
		ListToArray obj = new ListToArray();
		Integer[] array = obj.convertListToArray(list);
		System.out.println("Array elements are :");
		for (Integer x : array) {
			System.out.print(x + " ");
		}
	}

}
