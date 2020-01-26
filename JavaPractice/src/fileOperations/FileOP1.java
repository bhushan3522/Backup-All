package fileOperations;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOP1 {

	public static void main(String[] args) {

		try {
			FileOutputStream fos = new FileOutputStream("F:\\test.txt");
			String s = "This is a test text 2";
			byte sArr[] = s.getBytes();
			fos.write(sArr);
			fos.close();
			System.out.println("File is written");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
