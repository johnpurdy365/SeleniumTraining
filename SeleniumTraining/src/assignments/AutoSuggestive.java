package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		WebElement autoBox = driver.findElement(By.id("autocomplete"));
		
		autoBox.sendKeys("ind");
		autoBox.sendKeys(Keys.DOWN);
		autoBox.sendKeys(Keys.DOWN);
		autoBox.sendKeys(Keys.DOWN);
		System.out.println(autoBox.getAttribute("value"));

	}

}
