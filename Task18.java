package SeleniumCodes;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task18 
{
	public static void main(String[]args) {

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\raagu\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.rediff.com/");

		driver.findElement(By.xpath("//a[text()='Create Account']")).click();

		//Day

		WebElement day=driver.findElement(By.xpath("//select[contains(@name,'DOB_Day')]"));

		Select s = new Select(day);

		s.selectByIndex(20);//selecting a day

		List<WebElement>d=s.getOptions();

		int size =d.size();//Get Size

		System.out.println("Day Size=> "+size);

		for (int i = 0; i <=size-1; i++) 
		{
			String text=d.get(i).getText();

			System.out.println(text);
		}
		System.out.println();//Skipping to Next Line


		//Month

		WebElement month=driver.findElement(By.xpath("//select[contains(@name,'DOB_Month')]"));

		Select b =new Select(month);

		b.selectByVisibleText("FEB");//selecting a month

		List<WebElement>i=b.getOptions();

		int size1=i.size();

		System.out.println("Month Size=> "+size1);

		for (int j = 0; j <=size1-1; j++) 
		{
			String text1=i.get(j).getText();

			System.out.println(text1);
		}
		System.out.println();

		//Year

		WebElement year=driver.findElement(By.xpath("//select[contains(@name,'DOB_Year')]"));

		Select t = new Select(year);

		t.selectByVisibleText("2023");//selecting a year

		List<WebElement>m=t.getOptions();

		int size2=m.size();

		System.out.println("Year Size=> "+size2);

		for (int k = 0; k <=size2-1; k++) 
		{
			String text2=m.get(k).getText();

			System.out.println(text2);
		}
	}
}
