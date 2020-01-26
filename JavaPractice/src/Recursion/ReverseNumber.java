package Recursion;

public class ReverseNumber {

	public static void main(String[] args) {

		ReverseNumber r = new ReverseNumber();
		r.numberReversal(12345);
	}
	
	public void numberReversal(int n)
	{
		if(n < 10)
		{
			System.out.println(n);
		}
		else
		{
			System.out.print(n%10);
			numberReversal(n/10);
		}
	}

}
