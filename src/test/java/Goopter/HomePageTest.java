package Goopter;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjects.Home;
import PageObjects.Login;
import Resources.basicTest;

public class HomePageTest extends basicTest {
	
	Home homepage;
	Login LoginPage;

	public HomePageTest() throws IOException
	{
		super();
	}
	
	
@BeforeMethod()
public void setup() throws IOException
{
	initializedriver();
	homepage=new Home();
	
}

@Test(priority=3)
public void TitleTest()
{
	SoftAssert sa=new SoftAssert();
	
	Assert.assertEquals(homepage.pageTitle(), "Free CRM software in the cloud powers sales and customer service");
	System.out.println("In Title Testcase");
	
	//sa.assertEquals(actual, expected);

}

@Test(priority=2)
public void ImageTest()
{
	Assert.assertTrue(homepage.imgdisplay());
	System.out.println("In Image Testcase");
}

@Test(priority=1)
public void login() throws InterruptedException
{
	LoginPage=homepage.userLogin(pr.getProperty("Uname"), pr.getProperty("Password"));
	Assert.assertEquals(LoginPage.LoginTitle(), "CRMPRO");
	System.out.println("In Login Testcase");
	
}

@AfterMethod()
public void tearDown()
{
	driver.quit();
}


}
