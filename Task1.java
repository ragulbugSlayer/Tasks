package SeleniumCodes;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main (String [] args) {

		System.setProperty("webdriver.chrome.driver", 
				"./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");

		String FlipTitle = driver.getTitle();
		System.out.println("Flipkart Title=> "+FlipTitle);

		String FlipURL = driver.getCurrentUrl();
		System.out.println("Flipkart URL=> "+FlipURL);

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.navigate().to("https://www.amazon.in/");

		driver.navigate().back();

		driver.navigate().forward();

		driver.navigate().refresh();

		String AmzTitle = driver.getTitle();
		System.out.println("Amazon Title=> "+AmzTitle);

		String AmzURL = driver.getCurrentUrl();
		System.out.println("Amazon Url=> "+AmzURL);

		driver.close();




 

































































		driver.getTitle();


	}

}
