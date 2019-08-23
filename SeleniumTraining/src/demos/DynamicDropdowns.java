package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicDropdowns {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");

		//  //a[@value='MAA']  - Xpath for chennai

		//  //a[@value='BLR']
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		driver.findElement(By.xpath("//a[@value = 'BLR']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\'ctl00_mainContent_ddl_destinationStation1_CTNR\'] //a[@value = 'MAA']")).click();
/*
		

		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		driver.findElement(By.xpath("//*[@id=\'ctl00_mainContent_ddl_destinationStation1_CTNR\'] //a[@value = 'MAA']")).click();

		driver.findElement(By.xpath("//*[@id=\'ctl00_mainContent_ddl_destinationStation1_CTNR\'] //a[@value= 'MAA']")).click();
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
	*/
	}

}
