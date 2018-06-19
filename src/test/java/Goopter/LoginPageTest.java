package Goopter;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObjects.Home;
import PageObjects.Login;
import Resources.basicTest;

public class LoginPageTest extends basicTest {
	
	
	Login loginPageT;
	Home Home1;

	public LoginPageTest() throws IOException
	{
		super();
	}
	
@BeforeMethod()
public void setup() throws IOException, InterruptedException
{
	initializedriver();
	Home1=new Home();
	loginPageT=Home1.userLogin(pr.getProperty("Uname"),pr.getProperty("Password"));
	//driver.switchTo().frame("mainpanel");
	
}

@Test()
public void ContactMove() throws InterruptedException
{
	loginPageT.moveToObject();
}

//closing the browser in after method
@AfterMethod()
public void teardown()
	{
	driver.quit();
}

}
