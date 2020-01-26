package SimplePrograms;

import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {

		System.out.println("Enter size of array : ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter Elements in array : ");
		for(int i =0 ; i < size; i++)
		{
			a[i] = sc.nextInt();
		}
		
		int largest = a[0];
		int secondLargest = a[0];
		
		for(int i = 0; i < size;i++)
		{
			if(a[i] > largest)
			{
				secondLargest = largest;
				largest = a[i];
			}
			else
			{
				if(a[i] > secondLargest && a[i] < largest)
				{
					secondLargest = a[i];
				}
			}
		}
		System.out.println("Scond largest element is : "+secondLargest);
	}

}
