package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class right_click_operations {

	public static void main(String[] args) {
		FirefoxDriver d=new FirefoxDriver();
		d.get("https://www.google.com/");
		d.manage().window().maximize();
		WebElement link=d.findElement(By.linkText("Gmail"));
		Actions act=new Actions(d);
		act.contextClick(link).sendKeys("L").build().perform();
		
		
		

	}

}
