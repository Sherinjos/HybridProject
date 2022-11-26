package genericLib;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {

	//create a method and do typecasting
	public void getPhoto(WebDriver driver, String name) throws IOException {
		
		Date d = new Date();
		String currentdate = d.toString().replaceAll(":", "-");
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		//store it in a reference variable
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		//create an object for file class and specify the path and the name should be passed as a parameter to method
		File dest=new File(AutoConstant.photoPath+currentdate+name+".png");
		FileUtils.copyFile(src, dest);
		
		
	}
}
