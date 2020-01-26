package SimplePrograms;

public class CharOcc {
	
	public static void main(String args[])
	{
		char ch = 'a';
		String s = "This is aaaa test program";
		int count=0;
		for(int i = 0 ; i<s.length();i++)
		{
			if(s.charAt(i)==ch)
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
