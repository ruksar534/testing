package selenium;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class chrome_classesandobjects {
	WebDriver d;
	public void open_chrome()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sowjanya\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://www.amazon.com/");
		d.manage().window().maximize();
		
	}
	public void get_title()
	{
		System.out.println(d.getTitle());
	}
	public void get_Current_url()
	{
		System.out.println(d.getCurrentUrl());
	}
	public void drop()
	{
		WebElement a=d.findElement(By.id("searchDropdownBox"));
		List<WebElement> a1=a.findElements(By.tagName("option"));
		System.out.println(a1.size());
		
		
	}
	public void take_screenshot() throws IOException {
		File a1=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(a1,new File("C:\\Users\\Public\\a5.png"));
	}
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		chrome_classesandobjects cc=new chrome_classesandobjects();
		cc.open_chrome();
		cc.get_title();
		cc.get_Current_url();
		cc.drop();
		cc.take_screenshot();
		

	}

}
