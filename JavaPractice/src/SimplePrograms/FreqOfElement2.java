package SimplePrograms;

public class FreqOfElement2 {

	public static void main(String[] args) {

		int a[]= {1,1,2,1,2,3,1};
		
		int b[] = new int[a.length];
		
		for(int i =0; i<a.length;i++)
		{
			int count=1;
			if(a[i]!=-1)
				{
				for(int j = i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						count++;
						a[j] = -1;
					}
				}
			}
			b[i]=count;
		}
		System.out.println("Element\tFrequency");
		for(int i=0; i< a.length;i++)
		{
			if(a[i]!=-1)
			{
				System.out.println(a[i]+"\t"+b[i]);
			}
		}
	}

}
