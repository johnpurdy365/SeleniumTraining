package assignments;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingAssignment {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Multiple Windows')]")).click();
		
		//click on click here link
		driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
		
		//get title to see which one prints
		System.out.println(driver.getTitle());
		
		//switch to child window and print the text on that page
		//need to get all windows parent and child first
		Set<String> ids = driver.getWindowHandles();
		
		//iterate through the set of open windows
		Iterator<String> it = ids.iterator();
		String parentId = it.next();
		String childId = it.next();
		
		//switch to child window
		driver.switchTo().window(childId);
		
		//after switching to child window get text
		System.out.println("After switching to child window");
		System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'New Window')]")).getText());
		
		//switch back to parent window ant get text
		driver.switchTo().window(parentId);
		System.out.println("Switched back to parent window");
		System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'Opening a new window')]")).getText());
		
		

	}

}
