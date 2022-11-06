package scripting;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.CorejavaPage;
import pomPages.Skillraryloginpage;
import pomPages.WishlistPage;

public class Testcase3 extends BaseClass {
	
	@Test
	public void tc3() throws IOException, InterruptedException {
		Skillraryloginpage s1=new Skillraryloginpage(driver);
		s1.searchtextbox(pdata.getdata("coursename"));
		s1.searchbutton();
		
		CorejavaPage cp=new CorejavaPage(driver);
		cp.java();
		
		WishlistPage wp=new WishlistPage(driver);
		driverutilies.switchFrame(driver);
		wp.playbutton();
		Thread.sleep(10000);
		wp.pausebtn();
		driverutilies.switchbackframe(driver);
		wp.addtowishlist();
		
	}

}
