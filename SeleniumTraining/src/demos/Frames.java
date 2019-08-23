package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/droppable/");
		
		//find out how many frames are present
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		//switch frame
		//driver.switchTo().frame(0);
		
		//driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.cssSelector(("iframe[class = 'demo-frame']"))));
		//driver.findElement(By.id("draggable")).click();
		Actions a = new Actions(driver);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		a.dragAndDrop(source, target).build().perform();
		
		//switch back to main content outside iframe
		driver.switchTo().defaultContent();


		

	}

}
