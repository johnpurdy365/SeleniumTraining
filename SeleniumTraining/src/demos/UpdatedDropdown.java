package demos;



import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdatedDropdown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");

		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		//System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
			System.out.println("enabled");
				Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
		}
		
		//count the number of checkboxes
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

		System.out.println(driver.findElement(By.cssSelector("#ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
		driver.findElement(By.cssSelector("#ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
		System.out.println(driver.findElement(By.cssSelector("#ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());


		driver.findElement(By.id("divpaxinfo")).click();
		try {
			Thread.sleep(2000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int i = 1;
		while(i < 5) {
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}

		driver.findElement(By.id("btnclosepaxoption")).click();
		//System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

	}

	/*
	 * 
	 System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");

WebDriver driver =new ChromeDriver();

driver.get("http://spicejet.com"); //URL in the browser

Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

//Assert.assertFalse(true);System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();

System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
	 */
	/* 
	 */

}
