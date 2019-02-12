package SimplePrograms;


public class ArrMinMax {

	public static void main(String[] args) {
		
		int a[] = {3,2,10,9,50,1};
		
		int min = a[0];
		int max = a[0];
		
		for(int i =0 ; i< a.length;i++)
		{
			if(a[i] < min )
				min = a[i];
			else
				if(a[i] > max)
					max = a[i];
				
		}
		System.out.println("min number is :"+min);
		System.out.println("max number is :"+max);
	}

}
