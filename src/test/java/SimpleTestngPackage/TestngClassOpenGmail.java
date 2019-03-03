package SimpleTestngPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class TestngClassOpenGmail {
  @Test
  public void f() {
	  
	  System.out.println("I am running vai Testng xml and also from Git hub via Jenkins");
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

}
