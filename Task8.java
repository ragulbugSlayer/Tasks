package SeleniumCodes;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Task8 {


	public static void main(String[]args)

	{

		System.setProperty("webdriver.chrome.driver","C:\\webdriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.rediff.com/");

		driver.findElement(By.xpath("//a[text()='Create Account']")).click();

		String Text =driver.findElement(By.xpath("//td[text()='Create a Rediffmail account']")).getText();

		System.out.println(Text);

		driver.findElement(By.xpath("//input[starts-with(@name,'name')]")).sendKeys("Raagul Kanna");

		driver.findElement(By.xpath("//input[starts-with(@name,'login')]")).sendKeys("raagulkanna1998");

		driver.findElement(By.xpath("//input[starts-with(@name,'passwd')]")).sendKeys("raagul@123");

		driver.findElement(By.xpath("//input[starts-with(@name,'confirm')]")).sendKeys("raagul@123");

		driver.findElement(By.xpath("//input[starts-with(@name,'altemail')]")).sendKeys("raagulkanna2709@gmail.com");

		driver.findElement(By.xpath("//input[starts-with(@name,'mobno')]")).sendKeys("8056004605");

	}
}
