package Utilities;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Helper 
{

	public static void TakeScreenShoot(WebDriver driver , String screenshotName)
	{
		Path Destination = Paths.get("./Screenshots",screenshotName+".png");
		try {
			java.nio.file.Files.createDirectories(Destination.getParent());
			FileOutputStream out = new FileOutputStream(Destination.toString());
			out.write(((TakesScreenshot) driver) .getScreenshotAs(OutputType.BYTES));
			out.close();
		} catch (IOException e) {
			System.out.println("Exception While Taking ScreenShot" + e.getMessage());
		}
		
	}
}
