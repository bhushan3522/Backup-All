package SimplePrograms;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int number = sc.nextInt();
		sc.close();
		
		while(number > 0)
		{
			sum = sum + number % 10;
			number = number / 10 ;
		}
		System.out.println(sum);
	}

}
