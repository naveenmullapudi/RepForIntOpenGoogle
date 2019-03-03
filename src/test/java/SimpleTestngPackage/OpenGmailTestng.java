package SimpleTestngPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class OpenGmailTestng {

	@Test(dataProvider = "dp")
	public void f(Integer n, String s) {
		System.out.println("I am in Test " + s);
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("I am in Before Test");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("I am in After Test");
	}

	@DataProvider
	public Object[][] dp() {
		return new Object[][] { 
			new Object[] { 1, "anand" }, 
			new Object[] { 2, "naveen" }, };
	}
}
