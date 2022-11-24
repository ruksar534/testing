package selenium;

import org.testng.annotations.AfterTest;

public class logout extends NewTest{
  @AfterTest
  public void logou() {
	  d.close();
  }
}
