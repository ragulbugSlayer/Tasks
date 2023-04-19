package SeleniumCodes;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\raagu\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();


		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.linkText("Sign Up")).click();

		driver.findElement(By.name("firstname")).sendKeys("Raagul");

		driver.findElement(By.name("lastname")).sendKeys("Kanna");

		driver.findElement(By.name("reg_email__")).sendKeys("raagulkanna1998@gmail.com");

		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("raagulkanna1998@gmail.com");

		driver.findElement(By.name("reg_passwd__")).sendKeys("raagul12345");

		driver.findElement(By.partialLinkText("Privacy")).click();
	}

}
