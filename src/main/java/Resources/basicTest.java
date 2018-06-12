package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class basicTest {

public static  WebDriver driver;
public static Properties pr;

public  basicTest(){
	
	pr=new Properties();
	String path=System.getProperty("user.dir");
	System.out.println("path is "+path);
	String finalPath=path+"/src/main/java/Resources/data.properties";
	
	try {
		FileInputStream fis=new FileInputStream(finalPath);
		pr.load(fis);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}catch(IOException e){
		e.printStackTrace();
	}
}


	public void initializedriver() throws IOException
	{
		
	String BrowserName=pr.getProperty("browserType");
	if(BrowserName.equals("chrome"))
			{
		//System.out.println("2 in chrome");
		System.setProperty("webdriver.chrome.driver", "/Users/Sunitha/Documents/eclipse_folder/Chrome/chromedriver");
		//System.out.println("2 in chrome after driver set");
		driver=new ChromeDriver();
		//System.out.println("2 in chrome after driver assignment");
		}
	else if(BrowserName.equals("FireFox")){
		System.setProperty("webdriver.gecko.driver", "/Users/Sunitha/documents/eclipse_folder/geckodriver");
		driver=new FirefoxDriver();
	}
	else if(BrowserName.equals("Safari"))
	{
		driver=new SafariDriver();
	}
	//System.out.println("2 in chrome after if");
	driver.manage().deleteAllCookies();
	//driver.manage().window().maximize();
	driver.get(pr.getProperty("URL"));
	//System.out.println("2 in chrome end of function");
	
	}
	
	
public void switchToFrame()
{
	driver.switchTo().frame("mainpanel");
}
	
}
