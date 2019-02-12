package com.screenshot.util;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.screenshot.base.TestBase;

public class Util extends TestBase{

	public static void failed() throws IOException
	{
		TakesScreenshot ss = ((TakesScreenshot)driver);
		File ssfile = ss.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(ssfile, new File("D:\\failed.jpg"));
	}
	
}
