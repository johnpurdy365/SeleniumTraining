package demos;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSLCertifications {

	public static void main(String[] args) {
		
		//desired capabilities
		DesiredCapabilities ch = DesiredCapabilities.chrome();
		ch.acceptInsecureCerts();
		
		//belongs to local crhome browser
		ChromeOptions c = new ChromeOptions();
		c.merge(ch);
		
		System.setProperty("webdriver.chrome.driver", "C:\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(c);
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/20241/rsa-vs-ban-match-5-icc-cricket-world-cup-2019");
		


	}

}
