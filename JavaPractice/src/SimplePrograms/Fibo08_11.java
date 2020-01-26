package SimplePrograms;

import java.util.Scanner;

public class Fibo08_11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rane till you want to calculate fibonacci series : ");
		int range = sc.nextInt();

		Fibo08_11 fb = new Fibo08_11();
		int a[] = fb.createSeries(range);
		
		for(int i : a)
			System.out.print(i+" ");
	}
	private int[] createSeries(int n)
	{
		int first = 0, second=0,sum=1, fibo[];
		fibo = new int[n];
		
		for(int i=0; i < n; i++)
		{
			first = second;
			second = sum;
			sum = first+second;
			fibo[i] = first;
		}
		return fibo;
	}

}
