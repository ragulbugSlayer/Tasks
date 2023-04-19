package SeleniumCodes;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task22 
{
	public static void main(String[]args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\raagu\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");

		String parent=driver.getWindowHandle();

		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Vivo y01");//Textbox = Vivo y01

		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();

		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();//Search button click

		driver.findElement(By.xpath("//img[@alt='vivo Y01 (Elegant Black, 32 GB)'][@loading='eager']")).click();//Image click using multiple attribute

		Set<String> child = driver.getWindowHandles();

		for (String ab : child) 
		{
			driver.switchTo().window(ab);

			if (!parent.equals(ab)) 
			{
				driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();//add to cart
			}
		}
		
		Thread.sleep(2000);
		
		driver.close();
		
		driver.switchTo().window(parent); // Goto parent window
	}








}

