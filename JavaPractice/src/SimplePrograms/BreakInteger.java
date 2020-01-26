package SimplePrograms;

import java.util.Scanner;

public class BreakInteger {

	public static void main(String[] args) {

		System.out.println("Enter the integer : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	
		moduloRecur(n);
	}
	
	public static void moduloRecur(int x)
	{
		if(x>0)
		{
			moduloRecur(x/10);
			System.out.print(x%10);
		}
		return;
	}
	
	

}
