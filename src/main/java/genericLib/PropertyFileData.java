package genericLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileData {
	
	//Create a method and its a non-static method
	public String getData(String key) throws IOException {
		//create an object for properties class
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream(AutoConstant.propertyfilepath);
		p.load(fis);
		return p.getProperty(key);
		
		
	}

}
