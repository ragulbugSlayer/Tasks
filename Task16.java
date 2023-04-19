package SeleniumCodes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task16 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\raagu\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.rediff.com/");

		JavascriptExecutor a =(JavascriptExecutor)driver;

		a.executeScript("window.scrollBy(0,2000)"); //2000 go down

		Thread.sleep(3000);

		a.executeScript("window.scrollBy(0,-1500)");//-1500 go up

		Thread.sleep(3000);

	}

}
