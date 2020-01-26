package StringOps;

public class SortAlphabetically {

	public static void main(String[] args) {

		String s="This is Bhushan";
		String temp="null";
		String sArr[] = s.split(" ");
		for(int i=0; i < sArr.length;i++)
		{
			for(int j=i+1;j<sArr.length;j++)
			{
				
				if(sArr[i].compareTo(sArr[i+1])>0)
				{
					temp = sArr[i];
					sArr[i] = sArr[j];
					sArr[j] = temp;
				}
			}
		}
		System.out.print("Strings in Sorted Order:");
        for (int i = 0; i < sArr.length; i++) 
        {
            System.out.print(sArr[i] + " ");
        }
	}

}
