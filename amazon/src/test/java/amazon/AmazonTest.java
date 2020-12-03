package amazon;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listerns.class)
public class AmazonTest extends BaseClass {
	public static ama a;

	@BeforeMethod
	public void open() {
		openBrowser();
		a = new ama(driver);

	}

	@Test(priority = 1)
	public void userName() {
		open();
		a.user();

	}
	
	  @Test(priority = 2) 
	  public void password() { 
		  open(); 
		  a.user2();
	  
	  }
	 

	@AfterMethod
	public void quitBrowser() {
		driver.quit();
		

	}

}
