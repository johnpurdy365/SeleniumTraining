package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeExerciseAssignment6 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		
		//select any checkbox and grab label
		//put into a variable for next step
		driver.findElement(By.id("checkBoxOption1")).click();
		String text = driver.findElement(By.xpath("//div[@id='checkbox-example']//label[1]")).getText();
		
		//select same option in dropdown from label in chcekbox
		//this should come from first step above dynamically
		WebElement dropdown=driver.findElement(By.id("dropdown-class-example"));

        Select s=new Select(dropdown);

        s.selectByVisibleText(text);
		
		//enter grabbed label text into edit box
		//do not hard code. do it dynamically
        driver.findElement(By.name("enter-name")).sendKeys(text);
		
		//click on alert - verify if text present grabbed is present in pop up message
		driver.findElement(By.id("alertbtn")).click();
		
		 String text1 =  driver.switchTo().alert().getText();

	     if(text1.contains(text))

	     {

	    System.out.println("Alert message success");

	     }

	     else

	    System.out.println("Something wrong with execution");



	}

}
