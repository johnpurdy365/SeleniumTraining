package demos;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.accounts.google.com/signup");
		driver.findElement(By.id("Click on learn more link")).click();
		
		//get title to see which one prints
		System.out.println(driver.getTitle());
		
		//get all windows parent and child
		Set<String> ids = driver.getWindowHandles();
		
		//iterate through the set of open windows
		Iterator<String> it = ids.iterator();
		String parentId = it.next();
		String childId = it.next();
		
		//switch to child window
		driver.switchTo().window(childId);
		
		//print out child page title
		System.out.println("After Switching");
		System.out.println(driver.getTitle());
		
		//switch back to parent again
		driver.switchTo().window(parentId);
		
		//confirm parent title in print out
		System.out.println(driver.getTitle());
		System.out.println("After switching back to parent");

	}

}
