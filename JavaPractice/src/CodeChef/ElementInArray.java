package CodeChef;

import java.util.Scanner;

public class ElementInArray {

	public static void main(String[] args) {

		System.out.println("Enter size of array: ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		System.out.println("Enter elements in array: ");
		for(int i = 0; i < size; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Find the element to be searched: ");
		int search = sc.nextInt();
		
		for(int i=0; i < size; i++)
		{
			if(arr[i]==search)
			{
				System.out.println("Element "+search+" is present in array at "+i+" th index");
				break;
			}
		}
		sc.close();
		
	}

}
