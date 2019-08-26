package TestNGPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSignup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/SignUp");
		driver.findElement(By.xpath("//*[@id='firstName']")).sendKeys("Atul");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@name='lastName']")).sendKeys("Jain");

							
		Thread.sleep(5000);
		driver.close();
		
		
	}

}
