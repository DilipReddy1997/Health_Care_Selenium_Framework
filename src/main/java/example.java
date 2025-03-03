import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class example {
	@Test
	public void exma() throws InterruptedException {
		//WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.co.in/");
		Thread.sleep(500);
		WebElement el=driver.findElement(By.xpath("//textarea[@class=\"gLFyf\"]"));
		el.sendKeys("I am hero");
		el.sendKeys(Keys.ENTER);
		/*
		 * Actions action = new Actions(driver); action
		 */
	}

}
