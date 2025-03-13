package loginamazon;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.*;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Testcase2 extends Testcase1 {

	@Test
	public void search() throws IOException {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500);");
		js.executeScript("window.scrollBy(0,-400);");

		WebElement search = driver.findElement(By.id("twotabsearchtextbox")); // search 
		search.sendKeys("mobiles");
		WebElement click = driver.findElement(By.xpath("//input[@value='Go']"));  // maginifines glass
		click.click();
		WebElement Deliverday = driver.findElement(By.id("deliveryRefinements"));
		System.out.println(Deliverday.getTagName());
		System.out.println(Deliverday.getText());
		Deliverday.click();

		WebElement InstalledRAMSize = driver.findElement(By.id("p_n_feature_thirty_browse-bin/44897277031"));
		System.out.println(InstalledRAMSize.getTagName());
		System.out.println(InstalledRAMSize.getText());
		InstalledRAMSize.click();
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,900);");
		WebElement BatteryCapacity = driver.findElement(By.xpath("//span[text()='5,000 to 5,999 mAh']"));
		System.out.println(BatteryCapacity.getTagName());
		System.out.println(BatteryCapacity.getText());
		BatteryCapacity.click();
		System.out.println("scroll view seen batterycapacity");

	}

	@Test
	public void screenshot() throws IOException {
		LocalDateTime currentdatetime = LocalDateTime.now();
		System.out.println(currentdatetime);

		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy-hh-mm-ss");
		String snapname = currentdatetime.format(format);

		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		File dest = new File("D:\\AutomationTestonly\\Selenium_Web_Driver_MavenWay\\picture\\" + snapname + ".png");

		FileHandler.copy(source, dest);
		System.out.println("Take screenshot done");
	}

}
