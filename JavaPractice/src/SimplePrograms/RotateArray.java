package SimplePrograms;

import java.util.Scanner;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp;
		int a[] = {1,2,3,4,5,6,7,8,9};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many elements to be rotated : ");
		int n = sc.nextInt();

		for(int j = 0; j < n; j++)
		{
			temp = a[0];
			for(int i = 0; i < a.length-1; i++)
			{
				
				a[i] = a[i+1];
				a[a.length-1] = temp;
			}
		}
		
		System.out.println("Elements of array");
		for(int i = 0; i < a.length-1; i++)
		{
			System.out.print(a[i]);
			
		}
		
	}

}
