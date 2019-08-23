package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ryanair.com/gb/en/"); //URL in the browser
		WebElement source=driver.findElement(By.xpath("//input[@placeholder='Departure airport']"));
		source.clear();
		source.sendKeys("dublin");
		Thread.sleep(2000);
		source.sendKeys(Keys.ENTER);
		
		WebElement destination=driver.findElement(By.xpath("//input[@placeholder='Destination airport']"));
		destination.clear();
		destination.sendKeys("Barcelona");
		Thread.sleep(2000);
//		destination.sendKeys(Keys.ARROW_DOWN);
		destination.sendKeys(Keys.ENTER);

	}

}
