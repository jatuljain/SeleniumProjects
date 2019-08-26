import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import org.apache.commons.io.FileUtils;

import org.testng.annotations.Test;         

public class webDriverTakeScreenshot {
    public WebDriver driver;               

    @Test
    public void runDummyTest() throws Exception {
        driver = new FirefoxDriver();
        driver.get("http://www.testingexcellence.com");

        try {
            driver.findElement(By.id("dummyId")).click();
        }
        catch(Exception e) {
            System.out.println("Element Not Found");
            takeScreenshot();
        }
    }

    public void takeScreenshot() throws Exception {
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("C:\testresults\failed-test.png"));
    }
}