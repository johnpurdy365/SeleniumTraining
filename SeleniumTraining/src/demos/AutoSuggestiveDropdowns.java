package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdowns {

	public static void main(String[] args) {
		//enter the letters beng
		//verify if airport option is displayed in the suggestive box

		System.setProperty("webdriver.chrome.driver", "C:\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");

		WebElement fromPlace = driver.findElement(By.xpath("//input[@id='fromPlaceName']"));

		fromPlace.sendKeys("Beng");

		//need Javascript to extract hidden elements
		//use JavaSriptExecutor
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String script = "return document.getElementById('fromPlaceName').value";
		String text = (String) js.executeScript(script);
		System.out.println(text);
		int i = 0;
		while(!text.equalsIgnoreCase("BENGALURU INTERNATION AIRPORT")){
			i++;
			fromPlace.sendKeys(Keys.DOWN);

			text = (String) js.executeScript(script);
			System.out.println(text);
			if(i>10) {
				break;
			}
		}
		if(i>10) {
			System.out.println("not found");
		}

	}

}
