package SeleniumCodes;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task24 
{
	//iframes
	public static void main(String[]args) 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\raagu\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.w3schools.com/html/");

		List<WebElement> frame = driver.findElements(By.tagName("iframe"));

		int size = frame.size();//getSize
		System.out.println(size);

		for(int i=0;i<=size-1;i++)//getText 
		{
			String Text=frame.get(i).getText();
			System.out.println(Text);
		}

		for(WebElement ff:frame)//getAttribute 
		{
			String att = ff.getAttribute("id");
			System.out.println(att);		
		}
	}
}
