package assignments;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintNoOfLinks {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");

		//print number of links in the page
		System.out.println(driver.findElements(By.tagName("a")).size());

		//print number of links in footer only
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerDriver.findElements(By.tagName("a")).size());

		//find elements in column inside footer and print no of links
		WebElement columnDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columnDriver.findElements(By.tagName("a")).size());

		//click on each link in column and check each link is working
		for(int i = 1; i < columnDriver.findElements(By.tagName("a")).size(); i++) {
			String clickOnLinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
			Thread.sleep(5000L);
		}
		
		//iterate through the open tabs and get the page title
		Set<String> abc = driver.getWindowHandles();
		Iterator<String> it = abc.iterator();

		while (it.hasNext()){
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}



	}

}
