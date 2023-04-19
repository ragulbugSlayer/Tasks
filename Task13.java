package SeleniumCodes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Task13 
{
	public static void main(String[]args) 
	{
		ChromeOptions opt = new ChromeOptions();
		
		opt.addArguments("--headless");
		
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\raagu\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(opt);

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.rediff.com/");
		
		String Url =driver.getCurrentUrl();
		System.out.println(Url);
		
		String Title = driver.getTitle();
		System.out.println(Title);
		
		
	}

}
