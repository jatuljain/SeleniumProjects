package IntelipaatAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailRegistration {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "E://Automation//geckodriver-v0.20.1-win64//geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
 
		 driver.get("https://mail.google.com/mail/signup");
		 Thread.sleep(3000);
		 driver.findElement(By.name("FirstName")).sendKeys("Atul");
		 Thread.sleep(3000);
		 driver.findElement(By.name("LastName")).sendKeys("Jain");
		 Thread.sleep(3000);
		 driver.findElement(By.name("GmailAddress")).sendKeys("AtulIntelipaat@gmail.com");
		 Thread.sleep(3000);
		 driver.findElement(By.name("Passwd")).sendKeys("AtulIntelipaatpassword");
		 Thread.sleep(3000);
		 driver.findElement(By.name("PasswdAgain")).sendKeys("AtulIntelipaatpassword");
		 Thread.sleep(3000);
		 driver.findElement(By.id("birthday-placeholder")).sendKeys("AtulIntelipaatpassword");
		 Thread.sleep(3000);
		 
		 
		 
		 driver.close();
		 
		 
		 
	}

}
