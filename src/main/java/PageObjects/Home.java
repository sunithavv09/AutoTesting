package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Resources.basicTest;

import org.openqa.selenium.By;


public class Home extends basicTest {
	
@FindBy(name="username")
WebElement Uname;

@FindBy(name="password")
WebElement Passwrd;

@FindBy(xpath="//input[@value='Login']")
WebElement Loginbtn;

@FindBy(className="img-responsive")
WebElement img;

public Home()
{
	PageFactory.initElements(driver, this);
}


public String pageTitle()
{
 String title=driver.getTitle();
 return title;
 
}

public boolean imgdisplay(){
	
	return img.isDisplayed();
}


public Login userLogin(String username,String pwd) throws InterruptedException
{
	Uname.sendKeys(username);
	Passwrd.sendKeys(pwd);
	Thread.sleep(3000);
	Loginbtn.click();
	
	return new Login();
	
}




}
