package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hello {

	public static void main(String[] args) {
		
//		//create driver object for chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		driver.findElement(By.cssSelector("#email")).sendKeys("Test code");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("pass");
		driver.findElement(By.xpath("//*[@id=\'login_form\']/table/tbody/tr[3]/td[2]/div/a")).click();
		//tagname[@attribute = 'value']
		//input[@value = 'Log In']
		//input[@type = 'email']
		//input[@id = 'pass']
		//regular expression xpath
		//*[@type = 'email'] <span class="hmsprite logo"></span>
		//$x("//div[@class='zGVn2e']")
		//class="zGVn2e"
		

	}

}
