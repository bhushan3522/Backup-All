package StringOps;

import java.util.Scanner;

public class StrConcat {

	public static void main(String[] args) {

		System.out.println("Enter first String : ");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		
		System.out.println("Enter Second String : ");
		Scanner sc1 = new Scanner(System.in);
		String s2 = sc1.next();
		
		System.out.println("Testing immutability of String");
		s1.concat(s2);
		System.out.println("String is : "+s1);
		
		s1=s1.concat(" ").concat(s2);
		System.out.println("Proper Concatination is : "+s1);
		
		//String Concatenation using + operator
		String s3 = "Sachin";
		s3 = s3+"Tendulkar";
		System.out.println("New String is : "+s3);
		
		//String Concatenation with integers
		System.out.println(40+40+"Sachin"+40+40);
	}

}
