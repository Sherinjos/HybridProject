package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.CoreJavaPage;
import pomPages.SkillraryLoginPage;
import pomPages.WishlistPage;

public class TestCase3 extends BaseClass{
	
	@Test
	public void tc3() throws IOException, InterruptedException {
		SkillraryLoginPage s = new SkillraryLoginPage(driver);
		s.searchtextbox(pdata.getData("search"));
		s.searchbutton();
		
		CoreJavaPage c = new CoreJavaPage(driver);
		c.corejavacousre();
		
		WishlistPage w = new WishlistPage(driver);
		w.closepopup();
		
		driverutilities.switchFrame(driver);
		Thread.sleep(2000);
		w.playbutton();
		Thread.sleep(5000);
		w.pausebutton();
		driverutilities.switchBack(driver);
		w.addtowishlistbtn();
	}

}
