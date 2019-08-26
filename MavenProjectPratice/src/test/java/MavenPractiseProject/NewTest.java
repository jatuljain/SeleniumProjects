package MavenPractiseProject;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("This is my first Maven Project");
	 
  }
  
  @Test    
  public void executSessionOne(){
          //First session of WebDriver
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
          //Goto guru99 site
          driver.get("http://demo.guru99.com/V4/");
          //find user name text box and fill it
          driver.findElement(By.name("uid")).sendKeys("Driver 1");
          
      }
      
  @Test    
      public void executeSessionTwo(){
          //Second session of WebDriver
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
          //Goto guru99 site
      driver.get("http://demo.guru99.com/V4/");
      //find user name text box and fill it
      driver.findElement(By.name("uid")).sendKeys("Driver 2");
      
      }
      
  @Test    
      public void executSessionThree(){
          //Third session of WebDriver
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
          //Goto guru99 site
      driver.get("http://demo.guru99.com/V4/");
      //find user name text box and fill it
      driver.findElement(By.name("uid")).sendKeys("Driver 3");
      
      } 
}
