package CodeChef;

import java.util.Scanner;

public class Zoo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		validateWord(word);
	}
	
	public static void validateWord(String word) {
		int zCount=0,oCount=0;
		if(word.length()<=20) {
			for(int i =0;i<word.length();i++) {
				if(word.charAt(i)=='z') {
					zCount++;
				}
				else
					oCount++;
			}
		}
		if(oCount==2*zCount) {
			System.out.println("Yes");
		}
		else
			System.out.println("No");
	}

}
