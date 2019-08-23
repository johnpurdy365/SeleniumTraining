package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookXpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
/*		driver.findElement(By.xpath("//*[@type = 'email']")).sendKeys("john purdy");
		driver.findElement(By.xpath("//*[@type = 'password']")).sendKeys("pass");
		driver.findElement(By.xpath("//input[@value = 'Log In']")).click();
*/
		driver.findElement(By.cssSelector("input[name = 'email']")).sendKeys("john purdy");
		driver.findElement(By.cssSelector("[value = 'Log In']")).click();
	}

}
