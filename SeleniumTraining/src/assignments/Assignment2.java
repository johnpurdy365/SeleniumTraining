package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");

		// Select adults and child
		Select adult = new Select(driver.findElement(By.id("Adults")));
		adult.selectByValue("2");
		Select child = new Select(driver.findElement(By.id("Childrens")));
		child.selectByValue("1");

		// Departure on current date
		driver.findElement(By.id("DepartDate")).click();
		driver.findElement(By.linkText("23")).click();

		// Click link then enter airline in text field
		driver.findElement(By.id("MoreOptionsLink")).click();
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("Ryanair");

		// Click the search button
		driver.findElement(By.id("SearchBtn")).click();

		// Grab error message and print the output
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());

	}

}
