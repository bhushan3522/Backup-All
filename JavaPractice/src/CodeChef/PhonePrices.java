package CodeChef;

import java.util.Scanner;

public class PhonePrices {

	public static void main(String[] args) {

		System.out.println("Enter Number of test cases : ");
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i = 0; i < T; i++)
		{
			System.out.println("Enter number of days for which prices are known : ");
			int N = sc.nextInt();
			int P[] = new int[N];
			System.out.println("Enter Prices : ");
			for(int j = 0; j < N; j++)
			{
				P[j] = sc.nextInt();
			}
			int goodPrice = P[0];
			int good = 1;
			
			for(int k = 1; k < N; k++)
			{
				if(k < 6)
				{
					if(P[k] < goodPrice)
					{
						goodPrice = P[k];
						good++;
					}
				}
				else
				{
					goodPrice = P[k];
					for(int l = k-5 ; l < N; l++)
					{
						if(P[l] < goodPrice)
						{
							goodPrice = P[l];
							good++;
						}
					}
				}
			}
			System.out.println("Good Prices are observed on "+good+" days");
		}
	}

}
