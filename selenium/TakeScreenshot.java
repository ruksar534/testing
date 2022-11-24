package selenium;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TakeScreenshot {

	WebDriver driver;
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sowjanya\\Downloads\\chromedriver.exe\\chromedriver.exe");
		 driver=new ChromeDriver();
        driver.get("https://www.redbus.in/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@After
	public void tearDown() throws Exception {

	}

	@Test
	public void test() throws InterruptedException  {
		String month="Dec 2021";
		String date="13";
		driver.findElement(By.id("src")).sendKeys("Duttalur");
        		driver.findElement(By.id("dest")).sendKeys("Kadapa");
	    driver.findElement(By.id("onward_cal")).click();
        Thread.sleep(5000);
        while(true)
        {
    		String g=driver.findElement(By.xpath("/html/body/div[5]/table/tbody/tr[1]/td[2]")).getText();
    		Thread.sleep(5000);
    		if(g.equals(month))
    		{
    			break;
    		}
    		else
    		{
    			driver.findElement(By.xpath("/html/body/div[5]/table/tbody/tr[1]/td[3]/button")).click();
    		}

        }
        driver.findElement(By.xpath("//div[5]//table//tbody//tr//td[contains(text(),"+date+")]")).click();
        Thread.sleep(5000);
	    //Actions ac=new Actions(driver);
        //WebElement gh=driver.findElement(By.xpath("/html/body/section/div[2]/main/section/div/div[2]/section/div/button"));
	    //ac.doubleClick(gh).perform();
        
        driver.findElement(By.xpath("/html/body/section/div[2]/main/section/div/div[2]/section/div/button"));
	    Thread.sleep(3000);
		/*
		 * try { File
		 * srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 * FileUtils.copyFile(srcfile, new
		 * File("C:\\Users\\Sowjan\\Desktop\\inage.PNG"
		 *)); } catch(IOException e) {
		 * System.out.println("Exception msg:" +e.getMessage()); }
		 */
	}

	

}
