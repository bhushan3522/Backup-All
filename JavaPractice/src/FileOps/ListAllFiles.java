package FileOps;

import java.io.File;

public class ListAllFiles {

	public static void main(String[] args) {

		File f = new File("E://anime");
		String fList[] = f.list();
		for(String a : fList) {
			System.out.println(a);
		}
	}

}
