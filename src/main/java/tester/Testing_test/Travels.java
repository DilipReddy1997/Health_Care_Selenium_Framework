package tester.Testing_test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Travels {
@Test
public void Travels_HomePage()
{
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.navigate().to("https://uat.odysol.com/Web/air/default.aspx");
}
}
