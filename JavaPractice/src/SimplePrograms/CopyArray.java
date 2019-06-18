package SimplePrograms;

import java.util.Scanner;

public class CopyArray {

	public static void main(String[] args) {

		int a[] = new int[5];
		int b[] = new int[5];

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements in array");
		for(int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]);
		}
		
		for(int i = 0; i < a.length; i++)
		{
			b[i] = a[i];
		}
		System.out.println("Elements of second array");
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(b[i]);
		}
	}

}
