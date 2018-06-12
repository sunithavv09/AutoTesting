package PageObjects;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Resources.basicTest;

public class Login extends basicTest{

	Actions act=new Actions(driver);

@FindBy(xpath="//a[@title='Contacts']")
WebElement contacts;

@FindBy(xpath="//a[contains(text(),'New Contact')]")
WebElement newContact;

//@FindBy(xpath="(//a[@title='Contacts']/ul/child::li")
//List<WebElement> contactsmenu; 
	
public Login()
{
	PageFactory.initElements(driver,this);
	
}


public String LoginTitle()
{
	String LoginTitlemsg=driver.getTitle();
	
	return LoginTitlemsg;
}


public void moveToObject() throws InterruptedException
{
	switchToFrame();
act.moveToElement(contacts).build().perform();	
Thread.sleep(3000);
newContact.click();

//List<WebElement> contactsmenu=driver.findElements(By.xpath("//a[@title='Contacts']/ul/child::li"));

//int count=contactsmenu.size();
//System.out.println("webelements count" +count);
//System.out.println("webelements are" +contactsmenu);


}

///html/body/table[1]/tbody/tr[3]/td[1]/div/div/ul/li[4]/ul/li[2]/a

}
