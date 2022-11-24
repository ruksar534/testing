package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testng1 
{
	WebDriver d;
  @Beforemethod
	  public void opening_browser() {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Sowjanya\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
			d=new ChromeDriver();
			d.get("https://www.amazon.com/");
			d.manage().window().maximize();
			}
  @Test(priority=2)
		public void title()
		{
			System.out.println(d.getTitle());
		}
		@Test(priority=3)
		public void url()
		{
			System.out.println(d.getCurrentUrl());
		}
	@Aftermethod
		public void Screenshot() throws IOException
		{
			File src = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src,new File("C:\\Users\\a5.png"));
		}
 }
