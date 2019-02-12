package SimplePrograms;

import java.util.Scanner;

public class ArmstrongTest {

	public static void main(String[] args) {
		
		int digit,sum=0;
		System.out.println("Enter the number for the Armstrong test : ");
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		int a = number;
		sc.close();
		
		while(a > 0)
		{
			digit = a % 10;
			a = a / 10;
			sum = sum + digit * digit * digit;
		}
		if(sum == number)
			System.out.println("Number "+number+ " is Armstrong number");
		else
			System.out.println("Number "+number+ " is not Armstrong number");

	}

}
