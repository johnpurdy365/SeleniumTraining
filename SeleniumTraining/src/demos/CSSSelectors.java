package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectors {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=uk");
		//tagname[attribute = 'value']
		//if unique [attribute = 'value']
		driver.findElement(By.cssSelector("[class = 'input r4 wide mb16 mt8 username']")).sendKeys("12345");
		driver.findElement(By.cssSelector("[class = 'input r4 wide mb16 mt8 password']")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@id='Login']")).click();

	}

}
