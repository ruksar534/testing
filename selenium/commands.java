package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class commands {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sowjanya\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/index.php");
		d.manage().window().maximize();
		//d.findElement(By.linkText("REGISTER")).click();
		//d.findElement(By.name("firstName")).sendKeys("harini");
		//d.findElement(By.name("country")).sendKeys("INDIA");
		d.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul")).click();
		
		WebElement a=d.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul"));
		List<WebElement >b=a.findElements(By.tagName("a"));
		System.out.println(b.size());
		for(int i=0;i<b.size();i++)
		{
			System.out.println(b.get(i).getText());
		}
		d.close();
				
		

	}
	

}
