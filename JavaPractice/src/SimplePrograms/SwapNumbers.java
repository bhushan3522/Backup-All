package SimplePrograms;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first numbers: ");
		int first = sc.nextInt();
		
		System.out.println("Enter second number: ");
		int second = sc.nextInt();
		
		sc.close();
		
		first = first + second;
		
		second = first - second;
		
		first = first - second;
		
		System.out.println("After swap :\n"+first + "\n" + second );

	}

}
