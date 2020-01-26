package SimplePrograms;

import java.util.Scanner;

public class BreakNumber {

	public static void main(String[] args) {

		System.out.println("Enter a Number : ");
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		while(n > 10)
		{
			System.out.print(n%10);
			n = n/10;
		}
		
		
		

	}

}
