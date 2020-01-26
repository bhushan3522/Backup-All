package CodeChef;

import java.util.Scanner;

public class CalculateSpeed {

	public static void main(String[] args) {

		System.out.println("Enter Distance in meters");
		Scanner sc = new Scanner(System.in);
		float dist = sc.nextFloat();
		
		System.out.println("Hours needed: ");
		float hrs = sc.nextFloat();
		
		System.out.println("Minutes needed: ");
		float mins = sc.nextFloat();
		
		System.out.println("Seconds needed: ");
		float secs = sc.nextFloat();
		
		float totalTime = secs+mins*60+hrs*60*60;
		
		float speedSecs = dist/totalTime;
		
		System.out.println("Speed in Meter/Sec is : "+speedSecs+"=="+totalTime);
		System.out.println("Speed in Km/hr is : "+speedSecs*(3600/1000));
		System.out.println("Speed in Meter/Sec is : "+speedSecs*(3600/1609));
	}

}
