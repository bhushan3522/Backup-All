package StringOps;

public class StrOther {

	public static void main(String[] args) {

		//use of contains method
		String s1 = "My name is bhushan";
		if(s1.contains("bhushan1"))
		{
			System.out.println("Bhushan is present");
		}
		else
		{
			System.out.println("Bhushan is absent");
		}
		
		//use of starts with
		if(s1.startsWith("My"))
		{
			System.out.println("String is proper");
		}
		else
		{
			System.out.println("String is not proper");
		}
		
		//use of ends with
		if(s1.endsWith("bhushan"))
		{
			System.out.println("Ending is proper");
		}
		else
		{
			System.out.println("Ending is not proper");
		}
		
		//use of lowercase and uppercase methods
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		
		
	}

}
