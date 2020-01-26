package StringOps;

public class StrBubbleSort {

	public static void main(String[] args) {

		String s = "My Name Is Bhushan";
		String sArr[] = s.split(" ");
		String temp;
		for(int i =0;i<sArr.length;i++)
		{
			for(int j=i+1;j<sArr.length;j++)
			{
				if(sArr[i].compareTo(sArr[j]) > 0)
				{
					temp = sArr[i];
					sArr[i] = sArr[j];
					sArr[j] = temp;
				}
			}
			System.out.println(sArr[i]);
		}
		int vCount = 0;
		int cCount = 0;
		char ch[]=s.toLowerCase().toCharArray();
		for(int i=0; i < ch.length;i++)
		{
			if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u')
			{
				vCount++;
			}
			else
				if(ch[i] >= 'a' && ch[i] <= 'z')
				{
					cCount++;
				}
		}
		System.out.println("Number of Vowels are : "+vCount);
		System.out.println("Number of Consonents are : "+cCount);
	}

}
