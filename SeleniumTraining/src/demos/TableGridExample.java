package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//program to count the total of a column under a single table grid on a web page
public class TableGridExample {

	public static void main(String[] args) {

		int sum = 0;
		System.setProperty("webdriver.chrome.driver", "C:\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/20241/rsa-vs-ban-match-5-icc-cricket-world-cup-2019");
		
		//get the parent table first in order to select child elements
		WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		
		//count the rows only inside specific parent table above
		//this step is not necessary but helpful to count
		//int rowCount = table.findElements(By.cssSelector("cb-col cb-col-100 cb-scrd-itms")).size();
		
		//count the rows only inside specific parent table above
		//select the row then the third child element within that row to get our element
		int count = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		
		//loop through the table and print elements
		for(int i=0;i<count-2;i++) {
			//get the text as a string
			String value = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
			//convert the string to an int in order to count and add to sum
			int valueInteger = Integer.parseInt(value);
			sum = sum + valueInteger;
		}
		//System.out.println(sum);
		//print the last two row items in the table as css selector is different to loop above
		String extras = driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		int valueExtras = Integer.parseInt(extras);
		int total = sum + valueExtras;
		System.out.println(total);
		
		String actualTotal = driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
		int actual = Integer.parseInt(actualTotal);
		System.out.println(actual);
		
		if(total == actual) {
			System.out.println("Count Matches");
		}else {
			System.out.println("Count Failed");
		}

	}

}
