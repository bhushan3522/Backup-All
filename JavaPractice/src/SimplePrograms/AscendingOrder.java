package SimplePrograms;

import java.util.Scanner;

public class AscendingOrder {

	public static void main(String[] args) {
		
		int temp;
		
		System.out.println("Enter how many numbers you want to sort : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int nums[] = new int[n];
		System.out.println("Enter the numbers you want to sort : ");
		
		for(int i = 0 ; i < n ; i++)
		{
			nums[i] = sc.nextInt();
		}
		
		sc.close();
		
		//Display the unsorted array
		System.out.println("Unsorted array : ");
		
		for(int i = 0 ; i < n ; i++)
		{
			System.out.print(nums[i]+" ");
		}
		System.out.println();
		
		//sorting the array
		for(int i =0 ; i< n-1;i++)
		{
			for(int j =0 ;j < n - i - 1 ;j++)
			{
				if(nums[j] > nums[j+1])
				{
					temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
			}
		}
		
		//Display the unsorted array
		System.out.println("Sorted array : ");
		
		for(int i = 0 ; i < n ; i++)
		{
			System.out.print(nums[i]+" ");
		}		
		
	}

}
