package SimplePrograms;

import java.util.Scanner;

public class FreqOfElement {

	public static void main(String args[])
	{
		int visited = -1;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		
		int a[] = new int[n];
		int b[] = new int[n];
		
		System.out.println("Enter elements in array");
		for(int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		
		for(int i = 0; i < a.length; i++)
		{
			int count = 1;
			for(int j = i+1; j < a.length;j++)
			{
				if(a[i] == a[j])
				{
					count++;
					b[j] = visited;
				}
			}
			if(b[i] != visited)
				b[i] = count;
		}
		
		System.out.println("---------------------------");
		System.out.println("Element\t |\t Frequency");
		System.out.println("---------------------------");
		
		
		for(int i = 0 ; i < b.length; i++)
		{
			if(b[i]!=visited)
				System.out.println("   "+a[i]+"\t |\t "+"   "+b[i]);
		}
		
		System.out.println("---------------------------");
    }

}
