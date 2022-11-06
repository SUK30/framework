package scripting;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.AddtoCartPage;
import pomPages.SkillraryDemoLogin;
import pomPages.Skillraryloginpage;

public class Testcase1 extends BaseClass {
	
	@Test
	public void tc1() {
		Skillraryloginpage s1=new Skillraryloginpage(driver);
		s1.gerasbutton();
		s1.skillrarydemoapp();
		
		driverutilies.switchtabs(driver);
		
		SkillraryDemoLogin sd=new SkillraryDemoLogin(driver);
		driverutilies.mouseHover(driver,sd.getCoursetab());
		sd.seleniumtrainingbtn();
		
		AddtoCartPage ad=new AddtoCartPage(driver);
		driverutilies.doubleclick(driver,ad.getPlus());
		ad.cartbutton();
		
		driverutilies.alertpopup(driver);
		}
	

}
