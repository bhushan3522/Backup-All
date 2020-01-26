package Recursion;

public class PalindromeString {

	String reversed = "";
	String str = "aabaaaa";
	public static void main(String[] args) {

		PalindromeString ps = new PalindromeString();
		ps.reverseString(ps.str);
		
	}
	
	public void reverseString(String s)
	{
		if(reversed.toCharArray().length == str.toCharArray().length)
		{
			if(str.equals(reversed))
			{
				System.out.println("String is palindrome");
			}
			else
				System.out.println("Strin is not palindrome");
		}
			
		else
		{
			char ch[] = s.toCharArray();
			reversed+=s.charAt(ch.length-1);
			reverseString(s.substring(0, ch.length-1));
		}
		
	}

}
