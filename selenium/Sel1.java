package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel1 {
 
	public static void main(String args[]) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sowjanya\\Downloads\\chromedriver.exe\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://github.com/login");
		
		//String page=driver.getTitle();
		//System.out.println(page);
		
		driver.findElement(By.id("login_field"));
		driver.findElement(By.name("password"));
		
		
	}
}
