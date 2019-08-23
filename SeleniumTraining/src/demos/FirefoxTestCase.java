package demos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxTestCase {

	public static void main(String[] args) {
		
		//create driver object for Firefox browser
		System.setProperty("webdriver.chrome.driver", "C:\\software\\chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.ie");
		System.out.println(driver.getTitle());

	}

}
