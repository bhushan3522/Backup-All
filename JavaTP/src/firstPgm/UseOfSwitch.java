package firstPgm;

import java.util.Scanner;

public class UseOfSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("What to do in a particular time: ");
		System.out.println("What's the time?");
		Scanner sc = new Scanner(System.in);
		int time = sc.nextInt();
		sc.close();
		switch(time)
		{
			case 6 : 
				System.out.println("Go for jogging");
				break;
			case 7:
				System.out.println("Go to School");
				break;
			case 8:
			case 9:
			case 10:
			case 11:
			case 12:
			case 13:
			case 14:
				System.out.println("School");
				break;
			case 15:
			case 22:
			case 23:
			case 24:
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				System.out.println("sleep");
				break;
			default:
				System.out.println("study");
			break;
		}
	}

}
