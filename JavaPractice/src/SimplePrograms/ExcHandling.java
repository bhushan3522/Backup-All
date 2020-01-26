package SimplePrograms;

import java.io.FileInputStream;
import java.util.Scanner;

public class ExcHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		try {
			System.out.println(10/n);
		}
		catch(Exception e){
			e.getMessage();
		}
		try {
			FileInputStream fis = new FileInputStream("F://");
		}
		catch(Exception e) {
			e.getMessage();
		}

	}

}
