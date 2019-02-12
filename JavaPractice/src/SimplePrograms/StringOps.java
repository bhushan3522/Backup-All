package SimplePrograms;

public class StringOps {
	
	String day,month,year;
	
	public String reverseString(String s)
	{
		String name = s;
		String revName = "";
		int len = name.length();
		
		for(int i = len-1; i >= 0; i--)
		{
			revName = revName + name.charAt(i);
		}
		return revName;
	}
	
	public void palindrome(String actual, String reversed)
	{
		if(actual.equalsIgnoreCase(reversed))
			System.out.println("Given string is palindrome");
		else
			System.out.println("Given string is not palindrome");
	}
	
	public void splitStr(String s)
	{
		String date = s;
		String datearr[] = date.split("/");
		day = datearr[0];
		month = datearr[1];
		year = datearr[2];
	}

	public static void main(String[] args) {
		
		StringOps sop = new StringOps();
		
		String actual = "ANNA";
		String reversed = sop.reverseString(actual);
		System.out.println(reversed);
		
		sop.palindrome(actual, reversed);
		
		sop.splitStr("16/10/1991");
		System.out.println("Day is : "+sop.day);
		System.out.println("Month is : "+sop.month);
		System.out.println("Year is : "+sop.year);
		
	}

}
