package selenium;

import static org.junit.Assert.*;

import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel {

	WebDriver driver;
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sowjanya\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		
		driver =new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		
	}

	@After
	public void tearDown() throws Exception {
		driver.close();
	}

	@Test
	public void test() {
		
	}

}
