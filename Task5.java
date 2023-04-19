package SeleniumCodes;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5 
{

	public static void main (String []args)
	{

		System.setProperty("webdriver.chrome.driver", 
				"./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.rediff.com/");

		List <WebElement> Ele = driver.findElements(By.tagName("a"));

		int Size = Ele.size();
		System.out.println("Link Size => "+Size);

		for (int i = 0; i <= Size-1; i++) 
		{
			System.out.println("LinkName "+(i+1)+"-------->"+Ele.get(i).getText());	
		}

		for (WebElement alllink : Ele) {

			String Links = alllink.getAttribute("href");
			System.out.println(Links);

		}

		//		driver.close();

	}
}
