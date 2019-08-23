package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Actions a = new Actions(driver);
		WebElement move = driver.findElement(By.xpath("//span[contains(text(),'Hello, Sign in')]"));
		WebElement selectText = driver.findElement(By.id("twotabsearchtextbox"));
		a.moveToElement(selectText).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		//move to element
		a.moveToElement(move).contextClick().build().perform();

	}

}
