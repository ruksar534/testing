package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) {
    
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sowjanya\\Downloads\\chromedriver.exe\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		Actions ac=new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]")))
		.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu_admin_Job\"]"))).perform();
		
		driver.findElement(By.id("menu_admin_employmentStatus")).click();
		
		driver.findElement(By.xpath("//*[@id=\"btnAdd\"]")).click();
		
		//driver.findElement(By.xpath("//*[@id=\"empStatus_name\"]")).sendKeys("Sowjanya");
		driver.findElement(By.xpath("//*[@id=\"empStatus_name\"]")).sendKeys("Sowjanya");
        ac.doubleClick(driver.findElement(By.xpath("//*[@id=\"empStatus_name\"]"))).perform();		
        ac.contextClick(driver.findElement(By.xpath("//*[@id=\"Subscriber_link\"]"))).perform();
	}

	

}
