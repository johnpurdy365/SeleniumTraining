package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class E2ESpicejet {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		
		//handle dropdown
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
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		driver.findElement(By.xpath("//a[@value = 'DEL']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\'ctl00_mainContent_ddl_destinationStation1_CTNR\'] //a[@value = 'MAA']")).click();

		//Calendar
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']")).click();
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		//System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
			System.out.println("enabled");
				Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
		}
		
		//select checkbox
		driver.findElement(By.cssSelector("#ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
		
		//handle dropdown
		//see above as would not work at this point down the code
		
		
		//handle currency in dropdown
		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		//s.selectByValue("USD");
		//s.selectByIndex(1);
		s.selectByVisibleText("USD");
		
		//click search button
		//driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();
		//driver.findElement(By.cssSelector("input[name='ctl00$mainContent$btn_FindFlights']")).click();
		driver.findElement(By.xpath("//input[@name='ctl00$mainContent$btn_FindFlights']")).click();
		
		

		
	}

}
