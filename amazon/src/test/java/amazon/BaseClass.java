package amazon;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass implements IAutoConstant {

	public static WebDriver driver;
	public static Properties file = loadProperty(Path);
	public String urlTD = file.getProperty("URL");
	public ChromeOptions options;

	@BeforeClass
	public void autoExtension() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(urlTD);
		driver.manage().window().maximize();
	}

	public void openBrowser() {
		driver.get(urlTD);
		driver.manage().window().maximize();
	}

	public static Properties loadProperty(String path) {
		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream(path));

		} catch (Exception e) {
			System.err.println("Properties file cannot be handled");
		}
		return properties;
	}

}
