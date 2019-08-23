package demos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronize {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.booking.com/?aid=355028");
		driver.findElement(By.id("ss")).sendKeys("London");
		driver.findElement(By.xpath("//div[contains(@class,'sb-searchbox-submit-col -submit-button')]//button[contains(@class,'')] ")).click();
		
		//will wait until page is ready
		WebDriverWait d = new WebDriverWait(driver, 20);
		d.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Britannia")));
		
		driver.findElement(By.partialLinkText("Britannia")).click();

	}

}
//https://ksrtc.in/oprs-web/guest/home.do?h=1
