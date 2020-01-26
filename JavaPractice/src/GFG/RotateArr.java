package GFG;

import java.util.Scanner;

public class RotateArr {

	public static void main(String[] args) {

		System.out.println("Enter test cases count : ");
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		RotateArr ra = new RotateArr();
		for(int j = 0; j < T;j++)
		{
			System.out.println("Enter Size of array and rotations required : ");
			int size = sc.nextInt();
			int rotations = sc.nextInt();
			int arr[] = new int[size];
			System.out.println("Enter elements in array :");
			for(int k = 0; k < size;k++)
			{
				arr[k] = sc.nextInt();
			}
			
			arr = ra.RotateOp(arr, rotations);
			for(int k = 0; k < size;k++)
			{
				System.out.print(arr[k]);
				System.out.print(" ");
			}
		}
	}
	
	private int[] RotateOp(int a[],int d)
	{
		int temp;
		for(int i =0; i < d;i++)
		{
			temp = a[0];
			for(int l = 0 ; l < a.length-1;l++)
			{	
					{
						a[l] = a[l+1];
					}
			}
			a[a.length-1] = temp;
		}
		return a;
	}

}
