package SimplePrograms;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter starting range");
		int start = sc.nextInt();
		System.out.println("Enter last range");
		int last = sc.nextInt();
		
		PrimeNumbers pn = new PrimeNumbers();
		pn.generatePrimeNumbers(start, last);
		
	}
	
	public void generatePrimeNumbers(int start, int last)
	{
		
		if(start > last)
			System.out.println("Invalid range");
		else
		{
			for(int i =start;i<=last;i++)
			{
				int status = 1;
				//int m = i/2;
				for(int j = 2; j <i; j++)
				{
					if(i%j==0)
					{
						status=0;
						break;
					}
				}
				if(status!=0)
				{
					System.out.println(i);
				}
			}
		}
	}

}
