package TP;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProp {
	
	public static void main(String args[]) throws IOException
	{
		File file = new File("E:\\Projects\\TP\\src\\com\\tp\\config\\config.properties");
		FileInputStream fis = new FileInputStream(file);
		
		Properties prop = new Properties();
		prop.load(fis);
		
		System.out.println(prop.getProperty("browser"));
	}

}
