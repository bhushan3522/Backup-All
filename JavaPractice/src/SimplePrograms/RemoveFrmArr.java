package SimplePrograms;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveFrmArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> arrL = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size = sc.nextInt();
		
		System.out.println("elements of arr");
		for(int i = 0; i< size;i++)
		{
			arrL.add(sc.nextInt());
		}
		
		System.out.println("elements of arr");
		for(int i = 0; i< size;i++)
		{
			System.out.println(arrL.get(i));
		}
		System.out.println("which element to be removed :");
		int n = sc.nextInt();
		arrL.remove(n-1);
		
		System.out.println("elements of arr after deletion");
		for(int i = 0; i< arrL.size();i++)
		{
			System.out.println(arrL.get(i));
		}
		
	}

}
