package CodeChef;

import java.util.Scanner;

public class ConvertMinsToYears {

	public static void main(String[] args) {

		System.out.println("Enter Minutes that needs to be converted : ");
		Scanner sc = new Scanner(System.in);
		
		int mins = sc.nextInt();
		int years ,days;
		if(mins > 365*24*60)
		{
			years = mins/(365*24*60);
			days= (mins%(365*24*60)/(24*60));
		}
		else
		{
			years = 0;
			days= (mins/(24*60));
		}
		
		System.out.println(mins+" converts to "+years+" years and "+days+" days.");
	}

}
