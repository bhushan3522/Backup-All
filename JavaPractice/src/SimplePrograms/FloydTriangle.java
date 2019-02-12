package SimplePrograms;

import java.util.Scanner;

public class FloydTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k = 1;
		System.out.println("Level of triangle : ");
		Scanner sc = new Scanner(System.in);
		int level = sc.nextInt();
		sc.close();
		
		for(int i = 0; i < level; i++)
		{
			for(int j = 0; j <= i; j++)
			{
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}

	}

}
