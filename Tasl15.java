package SeleniumCodes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tasl15 
{


	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\raagu\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.naukri.com/");

		WebElement a= driver.findElement(By.xpath("//div[text()='Companies']"));

		Actions b = new Actions(driver);

		b.moveToElement(a).perform();

		Thread.sleep(3000);  

		driver.findElement(By.xpath("//div[text()='MNC']")).click();

	}
}