package SimplePrograms;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		int first, second = 0, third=1;
		
		System.out.println("Enter level : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		for(int i = 0; i < n; i++)
		{
			System.out.print(third);
			
			first = second;
			second = third;
			third = first + second;
			
			System.out.print(" ");
		}
	}

}
