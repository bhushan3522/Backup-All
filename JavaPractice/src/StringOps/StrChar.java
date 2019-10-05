package StringOps;

public class StrChar {

	public static void main(String[] args) {

		//use of charAtmethod
		String s1 = "My name is bhushan";
		for(int i=0; i<s1.length(); i++)
		{
			System.out.println("Character at "+(i+1)+ " location is : "+s1.charAt(i));
		}
		
		//use of toCharArray method
		String s2 = "My name is bhushan";
		char ch[] = s2.toCharArray();
		
		for(int i = ch.length-1; i >= 0; i--)
		{
			System.out.print(ch[i]);
		}
	}

}
