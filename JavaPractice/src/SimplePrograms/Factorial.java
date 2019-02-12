package SimplePrograms;

import java.util.Scanner;

public class Factorial {

	int result = 1;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number for which factorial is calculated : ");
		int number = sc.nextInt();
		sc.close();
		
		Factorial f = new Factorial();
		int factorial = f.fact(number);
		System.out.println("Factorial is : "+factorial);
	}
	
	public int fact(int n)
	{
		if(n > 0)
		{
			result = result * n;
			fact(n-1);
		}
		return result;
	}

}
