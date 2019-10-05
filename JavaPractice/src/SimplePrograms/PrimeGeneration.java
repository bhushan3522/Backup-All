package SimplePrograms;

public class PrimeGeneration {
	
	public void generatePrimeNumber(int firstNo, int lastNo)
	{
		System.out.println("Prime Numbers between "+firstNo+" and "+lastNo+" are : ");
		for(int i = firstNo; i<= lastNo; i++)
		{
			if(!(i%2==0 || i%3==0 || i%5==0 || i%7==0))
			{
				System.out.print(i+" ");
			}
			
		}
	}

}
