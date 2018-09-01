package amex;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AmexTest {
	
	@Test
	public void amext(){
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dev\\WebDriver All\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//Web Browser Links 1st Win
		driver.navigate().to("https://www.americanexpress.com/");
		
	}
	

}
