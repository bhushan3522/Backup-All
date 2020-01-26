package StringOps;

public class DuplicateChars {

	public static void main(String[] args) {

		String s1= "#@$@!#$%!!%@";
		char ch1[] = s1.toCharArray();
		
		int b[] = new int[ch1.length];
		
		for(int i =0; i<ch1.length;i++)
		{
			int count=1;
			if(ch1[i]!='_')
				{
				for(int j = i+1;j<ch1.length;j++)
				{
					if(ch1[i]==ch1[j])
					{
						count++;
						ch1[j] = '_';
					}
				}
			}
			b[i]=count;
		}
		System.out.println("Element\tFrequency");
		for(int i=0; i< ch1.length;i++)
		{
			if(ch1[i]!='_')
			{
				System.out.println(ch1[i]+"\t"+b[i]);
			}
		}
	}

}
