package stepDefination;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;

public class Test_Steps {
	private static WebDriver driver = null;
	 
	 
	 @Given(value = "I launch Chrome browser")
	// public static void main(String[] args) throws InterruptedException {
	 public static void newtours() throws InterruptedException {	 
	 // Create a new instance of the Firefox driver
//			System.setProperty("webdriver.gecko.driver", "E://Automation//geckodriver-v0.20.1-win64//geckodriver.exe");
			System.setProperty("webdriver.chrome.driver", "E:\\Automation\\chromedriver_win32\\chromedriver.exe");

	        driver = new ChromeDriver();
	 
	        //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
	 
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	        driver.get("http://newtours.demoaut.com/");
			 Thread.sleep(1000);
			 
			 driver.findElement(By.xpath("//*[text()='REGISTER']")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Atul");;
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Jain");;
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("98765");;
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("jatuljain");;
			 Thread.sleep(1000);
			 driver.findElement(By.cssSelector("input[name=address1]")).sendKeys("vaswani");;
			 Thread.sleep(1000);
			 driver.findElement(By.cssSelector("input[name=address2]")).sendKeys("Brentwood");;
			 Thread.sleep(1000);
			 driver.findElement(By.cssSelector("input[name=city]")).sendKeys("Bangalore");;
			 Thread.sleep(1000);
			 driver.findElement(By.cssSelector("input[name=state]")).sendKeys("Karnataka");;
			 Thread.sleep(1000);
			 driver.findElement(By.cssSelector("input[name=postalCode]")).sendKeys("560066");;
			 Thread.sleep(1000);
			 Select drpCountry = new Select(driver.findElement(By.name("country")));
			 drpCountry.selectByVisibleText("INDIA");
			 driver.findElement(By.cssSelector("input[name=email]")).sendKeys("atuljain@abcd.com");;
			 Thread.sleep(1000);
			 driver.findElement(By.cssSelector("input[name=password]")).sendKeys("#Password");;
			 Thread.sleep(1000);
			 driver.findElement(By.cssSelector("input[name=confirmPassword]")).sendKeys("#Password");;
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@name='register']")).click();
			 Thread.sleep(1000);		 
			 driver.close();
	 }
}
