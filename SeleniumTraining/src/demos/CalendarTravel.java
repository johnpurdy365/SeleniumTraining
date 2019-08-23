package demos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarTravel {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.xpath("//input[@id='travel_date']")).click();
		
		//select month first
		//[class='datepicker-days'] [class='datepicker-switch']
		//[class='datepicker-days'][class='next']
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("September")) {
			driver.findElement(By.cssSelector("[class='datepicker-days'] [class='next']")).click();
		}
		//grab the common attribute put it into list
		List <WebElement> dates = driver.findElements(By.className("day"));
		int count = dates.size();
		for(int i=0;i<count;i++) {
			String text = dates.get(i).getText();
			if(text.equalsIgnoreCase("14")) {
				dates.get(i).click();
				break;
			}
		}
		

	}

}
