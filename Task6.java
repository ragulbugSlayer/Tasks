package SeleniumCodes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task6 {


	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", 
				"./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.cssSelector("#login1")).sendKeys("Raagul Kanna");

		//for cssSelector supports only id and class (id="#value") , (class=".value")

		String Width = driver.findElement(By.cssSelector("#login1")).getCssValue("width");
		System.out.println(Width);

		driver.findElement(By.cssSelector("#password")).sendKeys("raagul@123");

		String Color =driver.findElement(By.cssSelector("#password")).getCssValue("border-color");
		System.out.println(Color);

		//driver.close();
	}
}
