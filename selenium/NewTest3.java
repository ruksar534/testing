package selenium;

import org.testng.annotations.Test;

public class NewTest3 {
  @Test(priority=1)
  public void login() {
	  System.out.println("login successfull");
  }
  @Test(priority=2)
  public void details()
  {
	  System.out.println("details");
  }
  @Test(priority=3)
  public void logout()
  {
	  System.out.println("logout Scuccessfull");
  }
 }
