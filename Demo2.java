package SeleniumCodes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Demo2 {

	public static void main(String[] args) {


		System.setProperty("webdriver.ie.driver",
				"C:\\Users\\raagu\\Downloads\\IEDriverServer_x64_4.8.0\\IEDriverServer.exe");

		WebDriver driver = new InternetExplorerDriver();


	}

}
