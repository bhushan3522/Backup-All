package SimplePrograms;

import java.util.Scanner;

public class Max {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int first = sc.nextInt();
		
		System.out.println("Enter second number: ");
		int second = sc.nextInt();
		
		System.out.println("Enter first number: ");
		int third = sc.nextInt();
		
		sc.close();
		
		int max;
		
		if(first > second)
		{
			if(first > third)
				max = first;
			else
				max = third;
		}
		else
			if(second > third)
				max = second;
			else
				max = third;
		
		System.out.println("Highest number is : "+max);
	}

}
