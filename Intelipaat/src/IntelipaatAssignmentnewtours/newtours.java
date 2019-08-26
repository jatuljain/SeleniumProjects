package IntelipaatAssignmentnewtours;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.base.Verify;


public class newtours {

//	public static void main(String[] args) throws InterruptedException {
	
	@Test
	public void newtourtest() throws InterruptedException {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.gecko.driver", "E://Automation//geckodriver-v0.24.0-win64//geckodriver.exe");
//		FirefoxDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		 driver.get("http://newtours.demoaut.com/");
		 Thread.sleep(1000);
		 
		 String Title = "Software Testing Material";
		 String GetTitle = driver.getTitle();
		 System.out.println("Assertion starts here...");
		 Verify.assertEquals(Title, GetTitle);
		 
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
