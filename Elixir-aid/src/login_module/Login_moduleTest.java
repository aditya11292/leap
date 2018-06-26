package login_module;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class Login_moduleTest {
  @Test
  public void f() {
  }
  WebDriver driver;
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("Webdriver.chrome.driver","D:\\Suman SP 01\\chromedriver.exe");
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
