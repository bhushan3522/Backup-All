package SimplePrograms;

import java.util.Scanner;

public class ReverseSent {

	public static void main(String[] args) {

		System.out.println("Enter a sentance which needs to be reversed : ");
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		String sArr[] = s.split(" ");
		String ans = "";
		for(int i=0 ; i < sArr.length; i++)
		{
			System.out.println(sArr[i]);
			//ans = ans+sArr[i];
			//System.out.println(ans);
		}
		
		//System.out.println("New String is : "+ ans.substring(0, ans.length() - 1));
	}

}
