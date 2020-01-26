package CodeChef;

import java.util.Scanner;

public class SeatingArranement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0; i<T;i++) {
			allocateSeats(sc.nextInt());
		}
		sc.close();
		
	}
	
	public static void allocateSeats(int n) {
		int seatModulo = n%12;
		switch(seatModulo) {
		case 1 : 
			System.out.println(n+11+" WS");
			break;
		case 2 :
			System.out.println(n+9+" MS");
			break;
		case 3 :
			System.out.println(n+7+" AS");
			break;
		case 4 :
			System.out.println(n+5+" AS");
			break;
		case 5 :
			System.out.println(n+3+" MS");
			break;
		case 6 :
			System.out.println(n+1+" WS");
			break;
		case 7 :
			System.out.println(n-1+" WS");
			break;
		case 8 :
			System.out.println(n-3+" MS");
			break;
		case 9 :
			System.out.println(n-5+" AS");
			break;
		case 10 :
			System.out.println(n-7+" AS");
			break;
		case 11 :
			System.out.println(n-9+" MS");
			break;
		case 0 :
			System.out.println(n-11+" WS");
			break;
		default :
			break;
		}
	}

}
