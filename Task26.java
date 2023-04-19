package SeleniumCodes;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task26 
{

	public static void main(String[]args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");


		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Automation sel");

		List<WebElement> s= driver.findElements(By.xpath("//div[@class='wM6W7d']/ul/li[2]"));

		for(WebElement aa:s) 
		{
			if (aa.getText().equals("automation selenium interview questions")) 
			{
				Thread.sleep(2000);
				aa.click();
			}
		}
	}
}
