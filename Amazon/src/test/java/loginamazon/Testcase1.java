package loginamazon;

import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase1 {
	WebDriver driver;

	@Test
  public void Openapp() {
	 
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ref=nav_logo");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
				
		WebElement error = driver.findElement(By.xpath("//a[text()='Try different image']"));
		error.click();
		System.out.println("open the app");

	
	}

		 }
 
