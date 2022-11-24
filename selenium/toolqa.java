package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class toolqa {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sowjanya\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://demoqa.com/text-box");
		d.manage().window().maximize();
		d.findElement(By.id("userName")).sendKeys("harini");
		d.findElement(By.id("userEmail")).sendKeys("hariniramireddy625@gmail.com");
		d.findElement(By.id("currentAddress")).sendKeys("visvodaya engineering college\n kavali");
		d.findElement(By.id("permanentAddress")).sendKeys("Visvodaya engineering college\nkavali");
		Thread.sleep(2000);
		WebElement t=d.findElement(By.id("submit"));
		t.click();
		
		String s1=d.findElement(By.id("output"));
	}

}
