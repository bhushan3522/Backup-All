package SimplePrograms;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		
		int newNum = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to be reversed : ");
		int number = sc.nextInt();
		sc.close();
		
		while(number > 0)
		{
			newNum = (newNum * 10) + number % 10;
			number = number / 10;			
		}
		
		System.out.println("Number after reversal : "+newNum);
	}

}
