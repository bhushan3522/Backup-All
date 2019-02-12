package SimplePrograms;

import java.util.Scanner;

public class SumOfN {

	public static void main(String[] args) {
		
		int n,sum = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many numbers needs to be added : ");
		n = sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter Numbers");
		
		for(int i = 0; i < n; i++)
		{
			arr[i] = sc.nextInt();
			sum = sum + arr[i];
		}
		sc.close();
		
		System.out.println("Sum is : "+sum);
		
		

	}

}
