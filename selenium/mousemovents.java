package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousemovents {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://jqueryui.com/menu/");
		d.manage().window().maximize();
		d.switchTo().frame(0);
		
		WebElement music=d.findElement(By.id("ui-id-9"));
		music.click();
		Thread.sleep(2000);
		
		WebElement modern=d.findElement(By.id("ui-id-13"));
		modern.click();
		Thread.sleep(2000);
		
		Actions act=new Actions(d);
		act.moveToElement(music).moveToElement(modern).build().perform();
		
		
	}

}
