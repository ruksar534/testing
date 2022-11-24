package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class pro {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sowjanya\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("http://www.amazon.com");
		d.manage().window().maximize();
		String a=d.getTitle();
		System.out.println(a);
		d.findElement(By.id("searchDropdownBox")).sendKeys("deals");
		d.findElement(By.id("twotabsearchtextbox")).sendKeys("laptops");
		
		d.close();
		

	}

}
