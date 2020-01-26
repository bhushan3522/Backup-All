package fileOperations;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileOP2 {

	public static void main(String[] args) {

		File f = new File("F:\\test.txt");
		Scanner sc;
		try {
			sc = new Scanner(f);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		}
		
	}

