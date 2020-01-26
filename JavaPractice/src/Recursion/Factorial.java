package Recursion;

public class Factorial {

	int output;
	public static void main(String[] args) {

		Factorial f = new Factorial();
		System.out.println("Factorial is : "+f.fact(-1));
	}
	
	public int fact(int n)
	{
		if(n == 0 || n == 1)
			return 1;
		
		else
		{
			output = n*fact(n-1);
		}
		return output;
	}

}
