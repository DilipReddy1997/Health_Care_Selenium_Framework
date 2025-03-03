package Base_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class base_Class { 
	public static WebDriver driver;
	@Test
	public static void Base_Class() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}

}