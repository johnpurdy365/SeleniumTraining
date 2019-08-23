package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableAssignment {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.qaclickacademy.com/practice.php");
		
		//find the table first
		WebElement table = driver.findElement(By.id("product"));
		
		//find the number or rows
		System.out.println(table.findElements(By.tagName("tr")).size());
		
		//find the number of columns
		System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());
		
		//get row content of row 2
		List <WebElement> secondRow = table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
		System.out.println(secondRow.get(0).getText());
		System.out.println(secondRow.get(1).getText());
		System.out.println(secondRow.get(2).getText());

	}

}
