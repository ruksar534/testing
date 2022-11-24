package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class cookies {
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.manage().deleteAllCookies();
		Thread.sleep(2000);
		d.get("http://www.gmail.com");
		Thread.sleep(2000);
		int cs=d.manage().getCookies().size();
		if(cs!=0)
			System.out.println("cookies created successfully");
		else
			System.out.println("cookies are not created");
		d.close();
		
		
	}

}
