package assignment_21_jun15th;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;



public class SetCopyMainClass {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Set<Integer> h1 = new HashSet<Integer>();
		Set<Integer> h2 = new HashSet<Integer>();
		System.out.println("Enter the size of set");
		int size=scanner.nextInt();
		System.out.println("Enter the elements");
		for(int i=0;i<size;i++)
		{
			h1.add(scanner.nextInt());
		}

		SetCopy obj=new SetCopy();
		System.out.println(obj.copySet(h1, h2));

	}

}
	