package SeleniumCodes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task11 
{

	public static void main(String[]args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\raagu\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.tnstc.in/home.html");
		
		driver.findElement(By.xpath("//a[text()='SEARCH']")).click();
		
		Alert ac = driver.switchTo().alert();
		
		String Text = ac.getText();
		
		System.out.println(Text);
		
		Thread.sleep(3000);
		
		ac.accept();

	}
}
