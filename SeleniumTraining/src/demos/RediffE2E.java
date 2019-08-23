package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffE2E {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		//driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")).sendKeys("12345");
		//$x("//div[@class='zGVn2e']/div/div[1]/input")
		//
////div[@class='zGVn2e']/div/div[1]/input
//		driver.get("http://rediff.com");
//		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
//		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("hello");
//		driver.findElement(By.cssSelector("input#password")).sendKeys("goodbye");
//		driver.findElement(By.xpath("//input[contains(@name,'procee')]")).click();


	}

}
