package demos;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PropertiesDemo {
	
	public WebDriver driver;
	
	
	@Test
	public void login() throws IOException {
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\1521722\\eclipse-workspace\\SeleniumTraining\\src\\demos\\login.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("username"));
		if(prop.getProperty("browser").equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\software\\chromedriver.exe");
			driver = new ChromeDriver();
		}else {
			System.out.println("undble to find browser");
		}
		driver.get(prop.getProperty("url"));
		
	}

}
