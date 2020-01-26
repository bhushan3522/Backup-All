package Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SecondHighest {

	public static void main(String[] args) {

		System.out.println("Enter size of array : ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		int a[] = new int[size];
		System.out.println("Enter elements of array :");
		for(int i = 0; i < size; i++)
		{
			a[i] = sc.nextInt();
		}

		Set<Integer> targetSet = new HashSet<Integer>();
		for(int n : a)
		{
			targetSet.add(n);
		}
		
		System.out.println(targetSet);
	}

}
