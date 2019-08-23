package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salesforce {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=uk");
		
		driver.findElement(By.xpath("//div[contains(@id,'usernamegroup')]/div/input")).sendKeys("12345");
		
		//tagName[contains(@attribute,'value')]
		//driver.findElement(By.id("username")).sendKeys("username");
		//driver.findElement(By.name("pw")).sendKeys("12345");
		//driver.findElement(By.xpath("//*[@id=\'forgot_password_link\']")).click();
		//driver.findElement(By.xpath("//*[@id='Login']")).click();
		//System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
		
	
	}

}
