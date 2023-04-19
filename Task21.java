package SeleniumCodes;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task21 
{
	public static void main(String[]args) 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\raagu\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");

		driver.findElement(By.xpath("//input[starts-with(@value,'m')]")).click();

		boolean e =driver.findElement(By.xpath("//input[starts-with(@value,'m')]")).isEnabled();
		System.out.println("is Enabled=> "+e);

		boolean m = driver.findElement(By.xpath("//input[starts-with(@value,'m')]")).isDisplayed();
		System.out.println("is Displayed=> "+m);

		driver.findElement(By.xpath("//input[starts-with(@value,'f')]")).click();

		boolean s =driver.findElement(By.xpath("//input[starts-with(@value,'f')]")).isSelected();

		System.out.println("is Selected=> "+s);
	}
}
