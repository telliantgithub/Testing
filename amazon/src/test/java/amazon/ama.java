package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ama extends BaseClass {

	@FindBy(xpath = "//input[@class='_2zrpKA _1dBPDZ']")
	public WebElement userName;

	

	public ama(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void user(){
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("hey");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("hey i am first");
		

	}
	
	public void user2() {
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("bye");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("Hey i am secound");
		
	}

}
