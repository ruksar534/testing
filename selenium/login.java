package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class login {
	WebDriver d;
  @BeforeClass
  public void opening_browser() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Sowjanya\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://www.amazon.com/");
		d.manage().window().maximize();
  }
  @Test(priority=1)
  public void title()
  {
	  System.out.println(d.getTitle());
  }
}
