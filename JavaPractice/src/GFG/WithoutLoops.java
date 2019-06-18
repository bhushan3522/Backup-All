package GFG;

import java.util.Scanner;

public class WithoutLoops {

	public static void main(String[] args) {

		WithoutLoops obj = new WithoutLoops();		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of test cases : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i = 0; i < n; i++)
		{
			System.out.println("Enter range for "+i+" test case");
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++)
		{
			obj.rec(0,arr[i]);
			System.out.println(" ");
		}
	}
	
	public void rec(int n,int p)
	{
		if(n < p)
		{
			System.out.print(++n+" ");
			rec(n,p);
		}
	}
}
