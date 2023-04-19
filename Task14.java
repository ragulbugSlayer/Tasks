package SeleniumCodes;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task14 
{
	public static void main(String[]args) {

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\raagu\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/");

		WebElement s =	driver.findElement(By.xpath("//a[text()='Create a Page']"));
		
		Actions g = new Actions(driver);
		
		g.contextClick(s).build().perform(); 
		
		g.contextClick(s).doubleClick().perform();

//		driver.quit();
	}
}
