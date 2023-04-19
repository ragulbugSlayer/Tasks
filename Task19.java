package SeleniumCodes;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task19 
{
	public static void main(String[]args) 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\raagu\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.rediff.com/");

		driver.findElement(By.xpath("//a[text()='Create Account']")).click();

		System.out.println("========< Country >========");

		WebElement country=driver.findElement(By.xpath("//select[starts-with(@name,'country')]"));

		Select s = new Select(country);

		List<WebElement> options = s.getOptions();

		int size = options.size();


		System.out.println("Total countrys=> "+size);

		s.selectByVisibleText("India");

		for (int i = 0; i <= size-1; i++) 
		{
			String Text = options.get(i).getText();

			System.out.println(Text);
		}

		//City

		WebElement city = driver.findElement(By.xpath("//select[starts-with(@name,'city')]"));

		Select a = new Select(city);

		List<WebElement> options2 = a.getOptions();

		int size2= options2.size();

		System.out.println("Total City=> "+size2);

		a.selectByVisibleText("Chennai");

		for (int i = 0; i <size2-1 ; i++) 
		{
			String Text2 = options2.get(i).getText();
			System.out.println(Text2);
		}

		//		driver.quit();
	}
}
